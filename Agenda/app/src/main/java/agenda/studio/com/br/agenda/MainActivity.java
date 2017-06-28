package agenda.studio.com.br.agenda;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private Button btn;
    private ListView lista;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

        //recuperar componentes
        texto = (EditText) findViewById(R.id.texto);
        btn = (Button) findViewById(R.id.btn);
        lista = (ListView) findViewById(R.id.lista);

        //Banco de dados
        db = openOrCreateDatabase("apptarefas", MODE_PRIVATE, null);

        //tabela tarefas
        db.execSQL("CREATE TABLE IF NOT EXISTS tarefas (id INTEGER PRIMARY KEY AUTOINCREMENT, tarefa VARCHAR )");

        //
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoDigitado = texto.getText().toString();
                salvarTarefas(textoDigitado);



            }
        });

            //Recupera as tarefas
            Cursor cursor = db.rawQuery("SELECT * FROM tarefas", null);

            //recupera os id das colunas
            int indiceColunaId = cursor.getColumnIndex("id");
            int indiceColunaTarefa = cursor.getColumnIndex("tarefa");

            //Lista as tarefas
            cursor.moveToFirst();

            while(cursor != null){
                Log.i("RESULTADO - ", "Tarefa: "+cursor.getString(indiceColunaTarefa));
                cursor.moveToNext();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void salvarTarefas(String texto){
        try {
            if(texto.equals("")){
                Toast.makeText(MainActivity.this, "Digite uma tarefa", Toast.LENGTH_SHORT).show();
            }else{
                db.execSQL("INSERT INTO tarefas (tarefa) VALUES(' "+ texto +" ') ");
                Toast.makeText(MainActivity.this, "Tarefa salva com sucesso", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

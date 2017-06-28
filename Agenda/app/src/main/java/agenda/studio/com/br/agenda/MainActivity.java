package agenda.studio.com.br.agenda;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private Button btn;
    private ListView lista;
    private SQLiteDatabase db;
    private ArrayAdapter<String> itens;
    private ArrayList<String> itensTarefas;
    private ArrayList<Integer> ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

        //recuperar componentes
        texto = (EditText) findViewById(R.id.texto);
        btn = (Button) findViewById(R.id.btn);
            //lista
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

          lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                  removerTarefa(ids.get(i));

              }
          });

            //Recuperar método ListarTarefa
            recuperarTarefas();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void salvarTarefas(String texto2){
        try {
            if(texto.equals("")){
                Toast.makeText(MainActivity.this, "Digite uma tarefa", Toast.LENGTH_SHORT).show();
            }else{
                db.execSQL("INSERT INTO tarefas (tarefa) VALUES(' "+ texto2 +" ') ");
                Toast.makeText(MainActivity.this, "Tarefa salva com sucesso", Toast.LENGTH_SHORT).show();
                recuperarTarefas();
                texto.setText("");

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void recuperarTarefas(){
        try {

            //Recupera as tarefas
            Cursor cursor = db.rawQuery("SELECT * FROM tarefas ORDER BY id DESC", null);

            //recupera os id das colunas
            int indiceColunaId = cursor.getColumnIndex("id");
            int indiceColunaTarefa = cursor.getColumnIndex("tarefa");

            //Criar adaptador
            itensTarefas = new ArrayList<String>();
            ids = new ArrayList<Integer>();
            itens = new ArrayAdapter<String>(   getApplicationContext(),
                                                android.R.layout.simple_list_item_2,
                                                android.R.id.text1,
                                                itensTarefas
            );
            lista.setAdapter(itens);

            //Lista as tarefas
            cursor.moveToFirst();
            while(cursor != null){
                Log.i("RESULTADO - ", "Tarefa: "+cursor.getString(indiceColunaTarefa));
                itensTarefas.add(cursor.getString(indiceColunaTarefa));
                ids.add(Integer.parseInt(cursor.getString(indiceColunaId)));

                cursor.moveToNext();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void removerTarefa(Integer id){
        try {

            db.execSQL("DELETE FROM tarefas WHERE id="+id);
            recuperarTarefas();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

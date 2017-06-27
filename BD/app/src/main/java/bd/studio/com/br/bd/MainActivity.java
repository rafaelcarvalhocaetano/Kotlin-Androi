package bd.studio.com.br.bd;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {



        SQLiteDatabase db = openOrCreateDatabase("app", MODE_PRIVATE, null);

        //tabela
        db.execSQL("CREATE TABLE IF NOT EXISTS pessoas(nome VARCHAR, idade INT(3) ) ");

        //Inserir dados
        db.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Rafael', 31) ");
        db.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Rosemeire', 28) ");

        //Cursor para verificar os itens
        Cursor cursor = db.rawQuery("SELECT nome, idade FROM pessoas ", null);

        int indiceColunaNome = cursor.getColumnIndex("nome");
        int indiceColunaIdade = cursor.getColumnIndex("idade");

        cursor.moveToFirst();

        while (cursor != null){
            Log.i("RESULTADO - nome: ", cursor.getString(indiceColunaNome));
            Log.i("RESULTADO - idade: ", cursor.getString(indiceColunaIdade));
            cursor.moveToNext();

        }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

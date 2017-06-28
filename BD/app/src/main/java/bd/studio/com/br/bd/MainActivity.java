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
        db.execSQL("CREATE TABLE IF NOT EXISTS pessoas(id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3) ) ");

            /*
        //Inserir dados

        db.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Vitor', 8) ");
        db.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Heitor', 3) ");


            //UPDATE
            db.execSQL("UPDATE pessoas SET idade = 20 WHERE nome = Rosemeire ", null);
            //DELETE
            db.execSQL("DELETE FROM pessoas WHERE nome = 'Rafael' ");
            // DROP

             db.execSQL("DROP TABLE pessoas ");
        */



        //Cursor para verificar os itens
        Cursor cursor = db.rawQuery("SELECT * FROM pessoas ", null);

        int indiceColunaNome = cursor.getColumnIndex("nome");
        int indiceColunaIdade = cursor.getColumnIndex("idade");
            int indiceColunaID = cursor.getColumnIndex("id");

        cursor.moveToFirst();

        while (cursor != null){
            Log.i("RESULTADO - NOME: ", cursor.getString(indiceColunaNome));
            Log.i("RESULTADO - IDADE: ", cursor.getString(indiceColunaIdade));
            Log.i("RESULTADO - ID: ", cursor.getString(indiceColunaID));
            cursor.moveToNext();

        }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

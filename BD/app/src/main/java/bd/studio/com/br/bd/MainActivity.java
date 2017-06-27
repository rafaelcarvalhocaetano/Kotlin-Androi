package bd.studio.com.br.bd;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db = openOrCreateDatabase("app", MODE_PRIVATE, null);

        //tabela
        db.execSQL("CREATE TABLE IF NOT EXISTS pessoas(nome VARCHAR, idade INT(3) ) ");

        //Inserir dados
        db.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Rafael', 31) ");
    }
}

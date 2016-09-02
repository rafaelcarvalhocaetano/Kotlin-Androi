package br.com.rcc.lojavirtual;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    Button btOk;
    CheckBox cbCsharp, cbAndroid, cbJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btOk = (Button) findViewById(R. id. btComprar);
        cbCsharp = (CheckBox) findViewById (R. id. cbCsharp);
        cbAndroid = (CheckBox) findViewById(R. id. cbAndroid);
        cbJava = (CheckBox) findViewById(R. id. cbJava);


        btOk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                String mensagem;

                if(!cbCsharp.isChecked() && !cbJava.isChecked() && !cbAndroid.isChecked()){

                    mensagem = "Você não selecionou nenhum livros:\n\n";
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setMessage(mensagem);
                    alertDialog.show();
                    return;

                }
                mensagem = "Você comprou os seguintes livros\n\n";

                if(cbCsharp.isChecked()){
                    mensagem = mensagem + "Csharp\n";
                }
                if(cbAndroid.isChecked()){
                    mensagem = mensagem +"Android\n";
                }
                if(cbJava.isChecked()){
                    mensagem = mensagem + "JAVA\n";
                }

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setMessage(mensagem);
                alertDialog.show();

            }

        });

    }
}

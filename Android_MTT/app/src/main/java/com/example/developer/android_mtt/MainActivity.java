package com.example.developer.android_mtt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tx1;
    private TextView tx2;

    private EditText senha;
    private EditText numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tx1 = (TextView) findViewById(R.id.tx1);
        tx2 = (TextView) findViewById(R.id.tx2);

        senha = (EditText) findViewById(R. id.senha);
        numero = (EditText) findViewById(R. id.numero);

    }

    public void btnSenha(View view){

        if(senha.getText().equals("rafael")){
            tx1.setText("Senha Correta");
        }else{
            tx1.setText("Senha Incorreta");
        }
    }
    public void btnNumero(View view){

        String num = numero.getText().toString();
        int n = Integer.parseInt(num);

        if(n % 2 == 0){
            tx2.setText("Senha Correta");
        }else{
            tx2.setText("Senha Incorreta");
        }
    }
}

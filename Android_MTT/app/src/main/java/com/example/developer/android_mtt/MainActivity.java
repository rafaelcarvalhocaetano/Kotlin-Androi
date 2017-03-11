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

    public void btnNumero(View view){
        String valorID = numero.getText().toString();
        int num2 = Integer.parseInt(valorID);

        if(num2%2==0){
            tx2.setText("O número é PAR");
        }else{
            tx2.setText("O número é IMPAR");
        }
    }
    public void btnSenha(View view){
        String senha1 = senha.getText().toString();

        if(senha.getText().equals("rafael")){

            senha.setText("Senha Correta");
        }else{
            senha.setText("Senha Incorreta");
        }
    }
}

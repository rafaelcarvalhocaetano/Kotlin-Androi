package br.com.rcc.app05myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btSegundaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btSegundaTela = (Button) findViewById(R. id. btSegundaTela);
        btSegundaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamarSegundaTela();
            }
        });
    }
    void chamarSegundaTela(){
        Intent  intent = new Intent();
        intent.setClass(MainActivity.this, SegundaActivity.class);
        startActivity(intent);
        finish();
    }
}

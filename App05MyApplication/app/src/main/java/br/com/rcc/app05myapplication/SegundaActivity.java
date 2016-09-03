package br.com.rcc.app05myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    Button btVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);



        btVoltar = (Button) findViewById(R. id. btVoltar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarParaPrimeiratela();
            }
        });
    }

    void voltarParaPrimeiratela(){
        Intent intent = new Intent();
        intent.setClass(SegundaActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}

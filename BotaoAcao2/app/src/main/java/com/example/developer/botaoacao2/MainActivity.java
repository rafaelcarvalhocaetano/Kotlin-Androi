package com.example.developer.botaoacao2;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView campoTexto = (TextView) findViewById(R.id.compoTexto);
        Button btnTexto = (Button) findViewById(R.id.btnTxt);
        Button btnCor = (Button) findViewById(R.id.btnCor);

        RelativeLayout fundoTela = (RelativeLayout) findViewById(R.id.activity_main);


        btnTexto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                campoTexto.setText("Rafael Alterando Texto");

            }
        });
        btnCor.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                fundoTela.setBackgroundColor(Color.parseColor("#0B9AE2"));
            }

        });

    }
}



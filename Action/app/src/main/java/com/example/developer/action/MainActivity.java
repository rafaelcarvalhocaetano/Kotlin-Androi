package com.example.developer.action;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView texto = (TextView) findViewById(R. id. txt);
        Button btnText = (Button) findViewById(R. id. btnCor);
        final Button btnFundo = (Button) findViewById(R. id. btnFundo);
        RelativeLayout r = (RelativeLayout) findViewById(R. id. activity_main);

        btnText.setOnClickListener(new Button.OnClickListener(){
                public void onClick(View v)
                {
                texto.setText("Rafael Conseguiu Alterar.....");
                }
            }
        );

        btnFundo.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                btnFundo.setBackgroundColor(Color.parseColor("#0B9AE2"));
            }
        }
        );

    }
}

package br.com.rcc.calcula_mamadeira;

import android.support.annotation.FloatRange;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    CheckBox ck_60, ck_90, ck_120, ck_150, ck_180, ck_210, ck_240, ck_270, ck_300;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ck_60 = (CheckBox) findViewById(R. id. ck_60);
        ck_90 = (CheckBox) findViewById(R. id. ck_90);
        ck_120 = (CheckBox) findViewById(R. id. ck_120);
        ck_150 = (CheckBox) findViewById(R. id. ck_150);
        ck_180 = (CheckBox) findViewById(R. id. ck_180);
        ck_210 = (CheckBox) findViewById(R. id. ck_210);
        ck_240 = (CheckBox) findViewById(R. id. ck_240);
        ck_270 = (CheckBox) findViewById(R. id. ck_270);
        ck_300 = (CheckBox) findViewById(R. id. ck_300);

        btnCalc = (Button) findViewById(R. id. btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               int tota = 0;

                if(ck_60.isChecked()){
                    total += 2;
                }
                if(ck_90.isChecked()){
                    total += 3;
                }
                if(ck_120.isChecked()){
                   total += 4;
                }
                if(ck_150.isChecked()){
                    total += 5;
                }
                if(ck_180.isChecked()){
                    total += 6;
                }
                if(ck_210.isChecked()){
                    total += 7;
                }
                if(ck_240.isChecked()){
                    total += 8;
                }
                if(ck_270.isChecked()){
                    total += 9;
                }
                if(ck_300.isChecked()){
                    total += 10;
                }




                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Aviso");
                alerta.setMessage(+String.valueOf(total)+ " Colheres");

                alerta.setNeutralButton("OK", null);
                alerta.show();

            }
        });



    }
}

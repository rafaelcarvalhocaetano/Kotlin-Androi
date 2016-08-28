package br.com.rcc.a02_appsomador;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2, etRes;
    Button btSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etnumero1);
        etNum2 = (EditText) findViewById(R.id.etnumero2);
        etRes = (EditText) findViewById(R.id.etresultado);

        btSomar = (Button) findViewById(R.id.btsomar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1, n2, res;

                n1 = Float.parseFloat(etNum1.getText().toString());
                n2 = Float.parseFloat(etNum2.getText().toString());
                res = n1 + n2;

                String strRes = String.valueOf(res);
                etRes.setText(strRes);

                AlertDialog.Builder caixaAlerta = new AlertDialog.Builder(MainActivity.this);
                caixaAlerta.setMessage("Pronto!!!!");

                caixaAlerta.show();

            }
        });
    }
}

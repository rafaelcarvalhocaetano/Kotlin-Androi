package br.com.rcc.rafaelcarvalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etRes;
    Button btSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id. etmedidas);
        etRes = (EditText) findViewById(R.id.etcolheres);

        btSomar = (Button) findViewById(R.id.btsomar);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float n1, res;
                float n2 = 75;

                n1 = Float.parseFloat(etNum1.getText().toString());
                n2 = Float.parseFloat(getText().toString());
                res = n1 / n2;

                String strRes = String.valueOf(res);
                etRes.setText(strRes);

                /*
                AlertDialog.Builder caixaAlerta = new AlertDialog.Builder(MainActivity.this);
                caixaAlerta.setMessage("Pronto!!!!");

                caixaAlerta.show();
                */

            }
        });
    }
}

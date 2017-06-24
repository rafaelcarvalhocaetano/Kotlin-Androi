package bnotas.studio.com.br.bnotas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private ImageView btn;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (ImageView) findViewById(R.id.btnSalvar);
        texto = (EditText) findViewById(R.id.blocoDeNotas);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoDigitado = texto.getText().toString();
                gravarArquivo(textoDigitado);

            }
        });
    }
    public void gravarArquivo(String t){
        try {
            OutputStreamWriter out = new OutputStreamWriter(openFileOutput("anotacaotxt", Context.MODE_PRIVATE));

        }catch (IOException e){
            Log.v("MainActivity", e.toString());

        }
    }
}

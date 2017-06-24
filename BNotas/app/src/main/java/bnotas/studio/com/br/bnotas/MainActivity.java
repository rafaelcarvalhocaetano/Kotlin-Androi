package bnotas.studio.com.br.bnotas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private ImageView btn;
    private EditText texto;
    private static final String NOME = "arquivo";

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
        //Recuperar
        if(lerArquivo() != null){
            texto.setText(lerArquivo());
        }
    }
    public void gravarArquivo(String t){
        try {
            OutputStreamWriter ot = new OutputStreamWriter( openFileOutput(NOME, Context.MODE_PRIVATE));
            ot.write(t);
            ot.close();

        }catch (IOException e){
            Log.v("MainActivity", e.toString());

        }
    }
    private String lerArquivo(){
        String result = "";
        try {

            //Abrir arquivo
        InputStream arquivo = openFileInput(NOME);
            if(arquivo != null){
                //ler arquivo
                InputStreamReader ip = new InputStreamReader(arquivo);

                //Gera Buffer do arquivo
                BufferedReader br = new BufferedReader(ip);

                //recuperar texto do arquivo
                String linhaArquivo = "";
                while ( (linhaArquivo = br.readLine()) != null){

                    result += linhaArquivo;

                }
                arquivo.close();
            }

        }catch (IOException e){
            Log.v("MainActivity", e.toString());
        }
        return result;
    }
}

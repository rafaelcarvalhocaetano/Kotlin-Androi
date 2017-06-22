package db.studio.com.br.armazenamentodedados;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private Button btn;
    private TextView exibir;

    private static final String ARQUIVO = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.texto);
        btn = (Button) findViewById(R.id.btn);
        exibir = (TextView) findViewById(R.id.exibir);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences(ARQUIVO,0);
                SharedPreferences.Editor editor = sp.edit();

                if(nome.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Por Favor Preencher o Nome !", Toast.LENGTH_SHORT).show();
                }else{
                    editor.putString("nome", nome.getText().toString() );
                    editor.commit();
                    exibir.setText("Nome: "+nome.getText().toString());
                }
            }
        });
        //REC
        SharedPreferences sps = getSharedPreferences(ARQUIVO,0);
        if(sps.contains("nome")){
            String nomeUsuário = sps.getString("nome", "Usuário não definido ... ");
            exibir.setText("Nome: " +nomeUsuário);
        }else{
            exibir.setText("Usuário não definido ... ");
        }
    }
}

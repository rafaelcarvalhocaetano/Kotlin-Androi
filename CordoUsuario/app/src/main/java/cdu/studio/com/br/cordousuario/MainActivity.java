package cdu.studio.com.br.cordousuario;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg;
    private RadioButton rb;
    private Button btn;
    private static final String ARQUIVO = "ARQUIVO ";
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.rg);
        btn = (Button) findViewById(R.id.btn);
        layout = (RelativeLayout) findViewById(R.id.id);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRb = rg.getCheckedRadioButtonId();
                if(idRb > 0){

                    rb = (RadioButton) findViewById(idRb);

                    SharedPreferences sp = getSharedPreferences(ARQUIVO, 0);
                    SharedPreferences.Editor editor = sp.edit();
                    String cor = rb.getText().toString();
                    editor.putString("corEscolhida", cor);
                    editor.commit();
                    rb.getText().toString();
                    background(cor);
                }
            }
        });
        //rec
        SharedPreferences shared = getSharedPreferences(ARQUIVO, 0);
        if(shared.contains("corEscolhida")){
          String corRec = shared.getString("corEscolhida", "Laranja");
          background(corRec);
        }
    }
    private void background(String cor){
        if(cor.equals("Azul")){
            layout.setBackgroundColor(Color.parseColor("#495b7c"));
        }else if(cor.equals("Amarelo")){
            layout.setBackgroundColor(Color.parseColor("#FFD0D31D"));
        }else if(cor.equals("Laranja")){
            layout.setBackgroundColor(Color.parseColor("#ffce26"));
        }

    }
}

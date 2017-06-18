package carros3.studio.com.br.carros3;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class JogoActivity extends AppCompatActivity {

    private ImageView imagem;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        botao = (Button) findViewById(R.id.btnVoltar);
        imagem = (ImageView) findViewById(R.id.img);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("cara")){
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.c2));
            }else{
                imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.c3));
            }
        }

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JogoActivity.this, MainActivity.class));
            }
        });
    }
}

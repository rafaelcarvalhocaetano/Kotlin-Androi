package carros3.studio.com.br.carros3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
       imagem = (ImageView) findViewById(R.id.imageView3);
    }
}

package fd.studio.com.br.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn;
    private TextView msg;
    private String [] frases = {"Enquanto Deus for meu chão," +
            "Não há quem me derrube","Da vida não quero muito. " +
            "Quero apenas saber que tentei tudo o que quis, " +
            "tive tudo o que pude, amei tudo o que valia " +
            "e perdi apenas o que, no fundo, nunca foi meu",
            "Ninguém vai bater mais forte do que a vida. " +
                    "Não importa como você bate e sim o quanto aguenta apanhar e continuar lutando; " +
                    "o quanto pode suportar e seguir em frente. É assim que se ganha"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        msg = (TextView) findViewById(R.id.tx);

        msg.setText(frases[1]);

    }
}

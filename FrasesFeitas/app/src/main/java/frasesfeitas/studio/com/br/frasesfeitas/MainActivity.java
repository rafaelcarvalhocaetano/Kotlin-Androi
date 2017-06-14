package frasesfeitas.studio.com.br.frasesfeitas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button b;
    private TextView t;
    private String [] frases = {
            "Primeiro",
            "Segundo",
            "Terceiro",
            "Quarta",
            "Quinta"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.btn);
        t = (TextView) findViewById(R.id.txt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();

                int n = r.nextInt(frases.length);

                t.setText(frases[n]);
            }
        });
    }
}

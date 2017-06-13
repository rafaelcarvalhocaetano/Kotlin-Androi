package fd.studio.com.br.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btn;
    private TextView msg;
    private String [] frases = {
            "Vitor",
            "Heitor",
            "Rose",
            "Rafael"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        msg = (TextView) findViewById(R.id.tx);

       // msg.setText(frases[2]);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int n = random.nextInt( frases.length);

                msg.setText(frases[n]);

            }
        });

    }
}

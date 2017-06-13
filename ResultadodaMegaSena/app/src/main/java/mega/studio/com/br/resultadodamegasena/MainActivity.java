package mega.studio.com.br.resultadodamegasena;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btnClick;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.btn);
        res = (TextView) findViewById(R.id.tx1);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rd = new Random();

                int gerar = rd.nextInt(59);

                res.setText("Número para Mega-Sena: "+gerar);

            }
        });



    }
}

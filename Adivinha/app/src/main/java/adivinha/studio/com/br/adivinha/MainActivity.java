package adivinha.studio.com.br.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnJogar;
    private TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = (Button) findViewById(R.id.btn);
        textoResultado = (TextView) findViewById(R.id.resultado);

       // textoResultado.setText("Texto Alterado ... ");

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rd = new Random();

                int numeroAleatorio = rd.nextInt(10);

                textoResultado.setText("Número escolhido é: "+numeroAleatorio);
            }
        });



    }
}

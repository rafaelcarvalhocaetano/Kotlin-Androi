package ae.studio.com.br.abastecimentoeconomico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText alcool;
    private EditText gasolina;
    private Button verificar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        alcool = (EditText) findViewById(R.id.alcool);
        gasolina = (EditText) findViewById(R.id.gasolina);
        verificar = (Button) findViewById(R.id.btn);
        resultado = (TextView) findViewById(R.id.resultado);


        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //criando variavel e convertendo
                String precoAlcool = alcool.getText().toString();
                String precoGasolina = gasolina.getText().toString();

                //convertendo para valor
                double valorAlcool = Double.parseDouble(precoAlcool);
                double valorGasolina = Double.parseDouble(precoGasolina);

                //obter valor da formula

                double rest = valorAlcool / valorGasolina;

                if(rest >= 0.7){
                    //gasolina
                    resultado.setText("É melhor utilizar a gasolina ... ");
                }else{
                   resultado.setText("É melhor utilizar o alcool ... ");
                }
            }
        });


    }
}

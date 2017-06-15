package idadedocachorro.studio.com.br.idadedocachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private Button btnIdade;
    private EditText idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.resultado);
        btnIdade = (Button) findViewById(R.id.btnIdade);
        idade = (EditText) findViewById(R.id.numero);


        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperando o que foi digitado
               String textoDigitado = idade.getText().toString();

                if(textoDigitado.isEmpty()){
                    //Mostrar mensagem de erro
                    resultado.setText("Insira um valor .... ");

                }else{

                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    resultado.setText("A idade do cachorro em anos humanos é: "+resultadoFinal+" Anos");

                }
            }
        });
    }
}

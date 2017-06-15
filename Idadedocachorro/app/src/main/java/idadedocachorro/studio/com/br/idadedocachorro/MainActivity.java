package idadedocachorro.studio.com.br.idadedocachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}

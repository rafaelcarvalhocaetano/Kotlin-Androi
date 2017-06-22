package rb.studio.com.br.qcomida_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg;
    private RadioButton escolhido;
    private Button btn;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.rg);
        btn = (Button) findViewById(R.id.btn);
        texto = (TextView) findViewById(R.id.exibirTexto);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int rb = rg.getCheckedRadioButtonId();
              if(rb > 0){
                  escolhido = (RadioButton) findViewById(rb);
                  texto.setText(escolhido.getText());
              }
           }
       });
    }
}

package cb.studio.com.br.cb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private CheckBox cao;
    private CheckBox onca;
    private CheckBox gato;
    private TextView exibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (CheckBox) findViewById(R.id.cao);
        onca = (CheckBox) findViewById(R.id.onca);
        gato = (CheckBox) findViewById(R.id.gato);
        exibir = (TextView) findViewById(R.id.exibirTexto);
        btn = (Button) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itens = "";

                itens += "Item Selecionado "+cao.getText()+" Status "+cao.isChecked()+"\n";
                itens += "Item Selecionado "+gato.getText()+" Status "+gato.isChecked()+"\n";
                itens += "Item Selecionado "+onca.getText()+" Status "+onca.isChecked()+"\n";

                exibir.setText(itens);
            }
        });

    }
}

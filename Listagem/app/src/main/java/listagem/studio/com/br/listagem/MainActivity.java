package listagem.studio.com.br.listagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ListView lista;
    private EditText texto;
    private ArrayList<String> info = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.btn);
        lista = (ListView) findViewById(R.id.lista);
        texto = (EditText) findViewById(R.id.texto);

        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                info
        );
        lista.setAdapter(adaptador);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String txt = texto.getText().toString();
                if(txt.length() > 0){
                    texto.setText("");
                    texto.findFocus();
                    info.add(txt);
                    adaptador.notifyDataSetChanged();
                }
            }
        });
    }
}

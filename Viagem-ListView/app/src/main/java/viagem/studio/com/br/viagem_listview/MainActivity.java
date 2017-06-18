package viagem.studio.com.br.viagem_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private String [] itens = {
            "SÃO PAULO - SP", "RIO DE JANEIRO - RJ",
            "BAHIA - BA", "PIAUI - PI", "CARAPICUÍBA - CPB",
            "OSASCO - OSS", "NOVO HORIZONTE - NH", "REGIÃO DAS PATAS - RP",
            "PATURIS - PT", "CARACAS - CR", "BOLSONARO - 2018", "PRESIDENTE DA REPÚBLICA - BOLSONARO"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.listagem);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
        lista.setAdapter(adaptador);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                String codigoClicado = lista.getItemAtPosition(codigoPosicao).toString();
                Toast.makeText(getApplicationContext(), "O local é "+codigoClicado,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

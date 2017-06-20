package signos.studio.com.br.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String [] signos = {
            "Árie", "Gemeos", "Touro",
            "Câncer", "Leão", "Virgem",
            "Libra", "Escorpião", "Sargitário",
            "Capricôrnio", "Aquario", "Peixe"
    };
    private String perfil = {
            "Bobo", "Chato", "Bravo",
            "Tonto", "Babaca", "Calmo",
            "Charope", "Tarada", "Boiando"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);


    }
}

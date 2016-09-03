package br.com.rcc.app06_blocodenotas;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etText;
    Button btCriar;
    ListView listView;

    private ArrayList<String> notas = new ArrayList<String>();
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        etText = (EditText) findViewById(R. id.etText);
        btCriar = (Button) findViewById(R. id. btCriar);
        listView = (ListView) findViewById(R. id. listView);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, notas);
        listView.setAdapter(adapter);

        btCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoNota = etText.getText().toString();
                if(textoNota.length()>0){
                    etText.setText(" ");
                    etText.findFocus();
                    notas.add(textoNota);
                    adapter.notifyDataSetChanged();
                }
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                adb.setMessage("Você deseja Apagar essa nota ?");
                final int positionToRemove = position;
                adb.setNegativeButton("Não", null);
                adb.setPositiveButton("Sim", new AlertDialog.OnClickListener(){

                    public void onClick (DialogInterface dialog, int which){
                        notas.remove(positionToRemove);
                        adapter.notifyDataSetChanged();
                    }

                });
                adb.show();
            }
        });
    }
}

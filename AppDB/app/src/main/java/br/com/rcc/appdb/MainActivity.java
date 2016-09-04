package br.com.rcc.appdb;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DBHelper dh;
    EditText etNome, etEndereco, etEmpresa;
    Button btInserir, btListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.dh = new DBHelper (this);
        etNome = (EditText) findViewById(R. id. etNome);
        etEndereco = (EditText) findViewById(R. id. etEndereco);
        etEmpresa = (EditText) findViewById(R. id. etEmpresa);

        btInserir = (Button) findViewById(R. id. btInserir);
        btListar = (Button) findViewById(R. id. btListar);

        btInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etNome.getText().length()>0 && etEmpresa.getText().length()>0 && etEndereco.getText().length()>0){

                    dh.insert(etNome.getText().toString(), etEndereco.getText().toString(), etEmpresa.getText().toString());
                    AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                    adb.setTitle("Sucesso");
                    adb.setMessage("Cadastro Realizado");
                    adb.show();

                    etNome.setText("");
                    etEndereco.setText("");
                    etEmpresa.setText("");

                }else{
                    AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                    adb.setTitle("Erro");
                    adb.setMessage("Todos os Campos devem ser preenchidos");
                    adb.show();

                    etNome.setText("");
                    etEndereco.setText("");
                    etEmpresa.setText("");

                }
            }
        });


        btListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List <Contato> contatos = dh.queryAll();
                if(contatos == null){

                    AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                    adb.setTitle("Mensagem");
                    adb.setMessage("Não há registros Cadastrados");
                    adb.show();

                    etNome.setText("");
                    etEndereco.setText("");
                    etEmpresa.setText("");
                    return;
                }
                for(int i=0;i<contatos.size(); i++){
                    Contato contato = (Contato) contatos.get(i);
                    AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                    adb.setTitle("Registro"+ i);
                    adb.setMessage("Nome: "+contato.getNome()+"\nEndereço: "+contato.getEndereco()+"\nEmpresa: "+contato.getEmpresa());
                    adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which){
                            dialog.dismiss();
                        }
                   });
                    adb.show();

                }
            }
        });

    }
}

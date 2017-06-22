package alerta.studio.com.br.alerta;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private AlertDialog.Builder dialog;
    private String a = "Passando parametros por referencia ... ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btn);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog = new AlertDialog.Builder(MainActivity.this);

                //cancelando alert
                dialog.setCancelable(false);
                //
                dialog.setIcon(android.R.drawable.btn_dialog);

                //titulo do alert
                dialog.setTitle("ALERTA ERRO || NÃO");
                //mensagem do alert
                dialog.setMessage(a);
                //btn não
                dialog.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Clicando não ", Toast.LENGTH_SHORT).show();
                    }
                });
                //btn sim
                dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Clicando em SIM", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.create();
                dialog.show();

            }
        });
    }
}

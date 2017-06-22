package somdosanimais.studio.com.br.somdosanimais;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView cao;
    private ImageView gato;
    private ImageView ovelha;
    private ImageView vaca;
    private ImageView leao;
    private ImageView macaco;
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (ImageView) findViewById(R.id.cao);
        gato = (ImageView) findViewById(R.id.gato);
        ovelha = (ImageView) findViewById(R.id.ovelha);
        vaca = (ImageView) findViewById(R.id.vaca);
        leao = (ImageView) findViewById(R.id.leao);
        macaco = (ImageView) findViewById(R.id.mac);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

        switch (v.getId()){
            case R.id.cao;
                mp = MediaPlayer.create(MainActivity.this, R.raw.cao);
                tocar();
                break;
            case R.id.gato;
                mp = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocar();
                break;
                break;
            case R.id.leao;
                mp = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocar();
                break;
                break;
            case R.id.mac;
                mp = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocar();
                break;
                break;
            case R.id.ovelha;
                mp = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocar();
                break;
                break;
            case R.id.vaca;
                mp = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocar();
                break;
                break;
           default:
        }

    }
    public void tocar(){
        if(mp != null){
            mp.start();
        }
    }
}

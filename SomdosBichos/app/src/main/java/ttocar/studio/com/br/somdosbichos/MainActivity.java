package ttocar.studio.com.br.somdosbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        mp = MediaPlayer.create(MainActivity.this, R.raw.musica);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp.isPlaying()){
                    pausar();
                }else{
                    tocarMusica();
                }

            }
        });
    }
    private void tocarMusica(){
        if(mp != null){
            mp.start();
            btn.setText("Pausar");
        }
    }
    private void pausar(){
        if(mp != null){
            mp.pause();
            btn.setText("Tocar");
        }
    }
    @Override
    protected void onDestroy(){

        if(mp != null && mp.isPlaying()){
            mp.stop();
            mp.release();
            mp = null;
        }
        super.onDestroy();
    }
}

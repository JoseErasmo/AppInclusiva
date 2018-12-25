package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Inicio extends AppCompatActivity {


//establecer un tiempo por defecto.
    private static final long SPLASH_SCREE_DELAY = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // se cambia la orientacion a la pantalla
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
        setContentView ( R.layout.activity_inicio );


        //controlar el tiempo del llamado de Screen.
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                //inicia el screebn y llama a la siguiente actividad.
                Intent intent = new Intent(Inicio.this, Bienvenida.class);
                startActivity(intent);

                //cierre de la actividad.
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREE_DELAY);


    }
}

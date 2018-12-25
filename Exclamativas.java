package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exclamativas extends AppCompatActivity {

    Button btncerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        // cambiar orientacion de la pantalla
        setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
        setContentView ( R.layout.activity_exclamativas );




        btncerrar =(Button)findViewById ( R.id.btn_cerrar_exclamativas );
        btncerrar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamado de la sigueinte actividad a traves del boton.
                Intent intent = new Intent ( Exclamativas.this, Modulo_3.class );
                startActivity ( intent );

                // finaslizar la actividad
                finish ();
            }
        } );
    }
}

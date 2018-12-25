package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dubitativas extends AppCompatActivity {
Button btncerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

       setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
        setContentView ( R.layout.activity_dubitativas );

        btncerrar =(Button)findViewById ( R.id.btn_cerrar_dubitativas );
        btncerrar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamado de la sigueinte actividad a traves del boton.
                Intent intent = new Intent ( Dubitativas.this, Modulo_6.class );
                startActivity ( intent );

                // finaslizar la actividad
                finish ();
            }
        } );
    }
}

package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Modulo_1 extends AppCompatActivity {
// se declaraboton de navegacion
    Button menu, btnconcepto,btnejercicios;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      // Cambiar orientacion de la pantalla.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_modulo_1 );

        videoView  = (VideoView) findViewById(R.id.videoView_mod1);
//
        String path = "android.resource://"+ getPackageName()+ "/" + R.raw.vdenunciativas;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start ();

        menu =(Button)findViewById ( R.id.btn_menu_modulo1 );
        menu.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamado de la sigueinte actividad a traves del boton.
                Intent intent = new Intent ( Modulo_1.this, Menu.class );
                startActivity ( intent );

                // finaslizar la actividad
                finish ();
            }
        } );

        btnconcepto =(Button)findViewById ( R.id.btn_concepto1);
        btnconcepto.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamado de la sigueinte actividad a traves del boton.
                Intent intent = new Intent ( Modulo_1.this, Enunciativas.class );
                startActivity ( intent );

                // finaslizar la actividad
                finish ();
            }
        } );

btnejercicios = (Button)findViewById ( R.id.btn_ejercicios1 );
btnejercicios.setOnClickListener ( new View.OnClickListener () {
    @Override
    public void onClick(View v) {
        //llamar la catividad atraves del botn en este caso mandaremos a llamar la actividadad Modulo_1_1

        Intent intent =new Intent ( Modulo_1.this, Modulo_1_1.class );
        startActivity ( intent );

        // finalizar la actividad.
        finish ();
    }
} );
    }
}

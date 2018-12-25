package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Modulo_6 extends AppCompatActivity {
    Button menu, btnsiguiente, btnconcepto, btnejercicios;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        // Cambiar orientacion de la pantalla.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        setContentView(R.layout.activity_bienvenida);
        setContentView ( R.layout.activity_modulo_6 );

        videoView  = (VideoView) findViewById(R.id.videoView_mod6);
//
        String path = "android.resource://"+ getPackageName()+ "/" + R.raw.vddubitativas;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start ();

        menu =(Button)findViewById ( R.id.btn_menu_modulo6 );
        menu.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamado de la sigueinte actividad a traves del boton.
                Intent intent = new Intent ( Modulo_6.this, Menu.class );
                startActivity ( intent );

                // finaslizar la actividad
                finish ();
            }
        } );



        btnconcepto =(Button)findViewById ( R.id.btn_concepto6);
        btnconcepto.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamado de la sigueinte actividad a traves del boton.
                Intent intent = new Intent ( Modulo_6.this, Dubitativas.class );
                startActivity ( intent );

                // finaslizar la actividad
                finish ();
            }
        } );


        btnejercicios = (Button)findViewById ( R.id.btn_ejercicios6 );
        btnejercicios.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamar la catividad atraves del botn en este caso mandaremos a llamar la actividadad Modulo_1_1

                Intent intent =new Intent ( Modulo_6.this, Modulo_6_1.class );
                startActivity ( intent );

                // finalizar la actividad.
                finish ();
            }
        } );


    }
}

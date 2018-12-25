package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Modulo_4 extends AppCompatActivity {
    // se declaraboton de navegacion
    Button menu, btnsiguiente, btnconcepto, btnejercicios;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        // Cambiar orientacion de la pantalla.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        setContentView(R.layout.activity_bienvenida);
        setContentView ( R.layout.activity_modulo_4 );

        videoView  = (VideoView) findViewById(R.id.videoView_mod4);
//
        String path = "android.resource://"+ getPackageName()+ "/" + R.raw.vdexhortativas;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start ();

        menu =(Button)findViewById ( R.id.btn_menu_modulo4 );
        menu.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamado de la sigueinte actividad a traves del boton.
                Intent intent = new Intent ( Modulo_4.this, Menu.class );
                startActivity ( intent );

                // finalizar la actividad
                finish ();
            }
        } );


        btnconcepto =(Button)findViewById ( R.id.btn_concepto4);
        btnconcepto.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamado de la sigueinte actividad a traves del boton.
                Intent intent = new Intent ( Modulo_4.this, Exhortativas.class );
                startActivity ( intent );

                // finaslizar la actividad
                finish ();
            }
        } );



        btnejercicios = (Button)findViewById ( R.id.btn_ejercicios4 );
        btnejercicios.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //llamar la catividad atraves del botn en este caso mandaremos a llamar la actividadad Modulo_1_1

                Intent intent =new Intent ( Modulo_4.this, Modulo_4_1.class );
                startActivity ( intent );

                // finalizar la actividad.
                finish ();
            }
        } );
    }
}

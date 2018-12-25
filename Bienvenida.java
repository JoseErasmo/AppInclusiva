package te.unan.edu.ni.appinclusiva;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static android.widget.VideoView.*;
import static te.unan.edu.ni.appinclusiva.R.drawable.*;

public class Bienvenida extends AppCompatActivity {
    // Se declara el boton siguiente.
    Button btnsiguiente;
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cambiar orientacion de la pantalla.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        setContentView(R.layout.activity_bienvenida);

       videoView  = (VideoView ) findViewById(R.id.videoView);
//
       String path = "android.resource://"+ getPackageName()+ "/" + R.raw.bienvenida;
       videoView.setVideoURI(Uri.parse(path));
      videoView.start ();


        //asiganamos el objeto boton al xml con el diseño.
        btnsiguiente = (Button)findViewById(R.id.btn_siguiente);
        btnsiguiente.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent(Bienvenida.this, Menu.class);
                startActivity(intent);

                // Finalizar la actividad.
                finish();

            }
        });



    }
}

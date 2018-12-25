package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Modulo_1_2 extends AppCompatActivity {
    Button btnsiguiente, btnatras;
    CheckBox afirmativa, negativa;
    Button btnvalidar;
    TextView repuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
        setContentView ( R.layout.activity_modulo_1_2 );


// asignamos eel objeto al xml o acciones de navegacion de los botones atraves de la actividad.
        btnsiguiente = (Button) findViewById ( R.id.btn_siguiente );
        btnsiguiente.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent ( Modulo_1_2.this, Modulo_1_3.class );
                startActivity ( intent );

                // Finalizar la actividad.
                finish ();

            }
        } );

        btnatras = (Button) findViewById ( R.id.btn_atras );
        btnatras.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                // realiza el llama a la actvidad anterior a traves del boton atras
                Intent intent = new Intent ( Modulo_1_2.this, Modulo_1_1.class );
                startActivity ( intent );

                // finalizar la actividad.
                finish ();
            }
        } );
//validar los chexboox
        btnvalidar = (Button) findViewById ( R.id.btn_validar );
        afirmativa = (CheckBox) findViewById ( R.id.chafirmativa );
        negativa = (CheckBox) findViewById ( R.id.chnegativa );
        repuesta = (TextView) findViewById ( R.id.txt_repuesta );
        //   incorrecto = (TextView) findViewById ( R.id.txt_incorrecto );

        btnvalidar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (afirmativa.isChecked ()){

                    repuesta.setText ( "Incorrecto");

                }else if (negativa.isChecked ()){

                    repuesta.setText ( "Correcto" );
                }
            }


        } );


    }}

package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Modulo_5_2 extends AppCompatActivity {
    Button btnmenu, btnatras;
    RadioButton verdadero, falso;
    Button btnvalidar;
    TextView repuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        //  Cambiar orientacion de la pantalla.
        setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
        setContentView ( R.layout.activity_modulo_5_2 );





// asignamos eel objeto al xml o acciones de navegacion de los botones atraves de la actividad.
        btnmenu= (Button) findViewById ( R.id.btn_menu );
        btnmenu.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent ( Modulo_5_2.this, Menu.class );
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
                Intent intent = new Intent ( Modulo_5_2.this, Modulo_5_1.class );
                startActivity ( intent );

                // finalizar la actividad.
                finish ();
            }
        } );
//validar los chexboox
        btnvalidar = (Button) findViewById ( R.id.btn_validar );
        verdadero = (RadioButton) findViewById ( R.id.rbverdadero5_2);
        falso = (RadioButton) findViewById ( R.id.rbfalso5_2);
        repuesta = (TextView) findViewById ( R.id.txt_repuesta );
        //   incorrecto = (TextView) findViewById ( R.id.txt_incorrecto );

        btnvalidar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (verdadero.isChecked ()){

                    repuesta.setText ( "Incorrecto");

                }else if (falso.isChecked ()){

                    repuesta.setText ( "Correcto" );
                }
            }


        } );
    }
}

package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Modulo_1_4 extends AppCompatActivity {
    Button btnmenu, btnatras;
    RadioButton verdadero, falso;
    Button btnvalidar;
    TextView repuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_modulo_1_4 );

        btnmenu = (Button)findViewById ( R.id.btn_menu );
        btnmenu.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                //inicar Screen y llama a la actvidad numero 1_3
                Intent intent = new Intent ( Modulo_1_4.this, Menu.class );
                startActivity ( intent );
                // finalizar la actividad.

                finish ();
            }
        } );



        //botnon regresar.




        btnatras = (Button) findViewById ( R.id.btn_atras );
        btnatras.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                // realiza el llama a la actvidad anterior a traves del boton atras
                Intent intent = new Intent ( Modulo_1_4.this, Modulo_1_3.class );
                startActivity ( intent );

                // finalizar la actividad.
                finish ();
            }
        } );




        //valiadar los chexboox


        btnvalidar = (Button) findViewById ( R.id.btn_validar );
        verdadero = (RadioButton) findViewById ( R.id.rbverdadero);
        falso = (RadioButton) findViewById ( R.id.rbfalso );
        repuesta = (TextView) findViewById ( R.id.txt_repuesta );



        btnvalidar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (verdadero.isChecked ()){

                    repuesta.setText ( "Incorrecto" );
                } else if (falso.isChecked ()){

                    repuesta.setText ( "Correcto" );
                }

            }
        } );

    }
}

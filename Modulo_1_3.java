package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Modulo_1_3 extends AppCompatActivity {
    Button btnsiguiente, btnatras;
    CheckBox afirmativa, negativa;
    Button btnvalidar;
    TextView repuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        setRequestedOrientation ( ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
        setContentView ( R.layout.activity_modulo_1_3 );


        btnsiguiente = (Button)findViewById ( R.id.btn_siguiente );
        btnsiguiente.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                //inicar Screen y llama a la actvidad numero 1_3
                Intent intent = new Intent ( Modulo_1_3.this, Modulo_1_4.class );
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
                Intent intent = new Intent ( Modulo_1_3.this, Modulo_1_2.class );
                startActivity ( intent );

                // finalizar la actividad.
                finish ();
            }
        } );




        //valiadar los chexboox


        btnvalidar = (Button) findViewById ( R.id.btn_validar );
        afirmativa = (CheckBox) findViewById ( R.id.chafirmativa );
        negativa = (CheckBox) findViewById ( R.id.chnegativa );
        repuesta = (TextView) findViewById ( R.id.txt_repuesta );



        btnvalidar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (afirmativa.isChecked ()){

                    repuesta.setText ( "Correcto" );
                } else if (negativa.isChecked ()){

                    repuesta.setText ( "Incorrecto" );
                }

            }
        } );

    }
}

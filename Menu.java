package te.unan.edu.ni.appinclusiva;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    //declaramos los btonoes que nos lleban a cada modulo.
    Button btnmodulo_1,btnmodulo_2,btnmodulo_3,btnmodulo_4,btnmodulo_5,btnmodulo_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Cambiar orientacion de la pantalla.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE );
        setContentView(R.layout.activity_menu);


        //asinamos el objeto boton al xml o loyout.


        // instanciamos el primer boton
        btnmodulo_1 =(Button)findViewById ( R.id.btnmodulo1 );
        btnmodulo_1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent(Menu.this, Modulo_1.class);
                startActivity(intent);

                //termianr la clase
                finish ();

            }
        } );


        // instanciamos el segundo boton
        btnmodulo_2 =(Button)findViewById ( R.id.btnmodulo2 );
        btnmodulo_2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent(Menu.this, Modulo_2.class);
                startActivity(intent);

                //termianr la clase
                finish ();


            }
        } );


// instanciamos el tercer boton
        btnmodulo_3 =(Button)findViewById ( R.id.btnmodulo3 );
        btnmodulo_3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent(Menu.this, Modulo_3.class);
                startActivity(intent);

                //termianr la clase
                finish ();


            }
        } );

// instanciamos el cuarto boton
        btnmodulo_4 =(Button)findViewById ( R.id.btnmodulo4 );
        btnmodulo_4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent(Menu.this, Modulo_4.class);
                startActivity(intent);

                //termianr la clase
                finish ();


            }
        } );

// instanciamos el tercer boton
        btnmodulo_5 =(Button)findViewById ( R.id.btnmodulo5 );
        btnmodulo_5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent(Menu.this, Modulo_5.class);
                startActivity(intent);

                //termianr la clase
                finish ();


            }
        } );



        // instanciamos el tercer boton
        btnmodulo_6 =(Button)findViewById ( R.id.btnmodulo6);
        btnmodulo_6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Inicia la screen y llama a la siguiente actividad
                Intent intent = new Intent(Menu.this, Modulo_6.class);
                startActivity(intent);

                //termianr la clase
                finish ();


            }
        } );


    }
}

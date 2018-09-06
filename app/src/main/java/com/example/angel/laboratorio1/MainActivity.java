package com.example.angel.laboratorio1;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables a utilizar
    Button btnReproductor;
    EditText tbCancion;
    Button btnBuscar;
    MusicList lista;
    private ListView lvReproductor;
    private Adaptador adaptador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaración de variables
        btnReproductor=(Button) findViewById(R.id.btnReproduccion);
        btnBuscar=(Button) findViewById(R.id.btnBuscar);
        tbCancion=(EditText) findViewById(R.id.tbCancionBuscada);
        lista=new MusicList();
        lvReproductor= (ListView) findViewById(R.id.lvListaCanciones);


        btnReproductor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                DevolverListaReproducción();
                lvReproductor.setAdapter(adaptador);
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String palabra=tbCancion.getText().toString().toLowerCase();

                if(lista.DevolverListaBusqueda(palabra)==null){
                    Toast.makeText(getApplicationContext(),"No se encuentran coincidencias",Toast.LENGTH_LONG).show();
                    lvReproductor.clearAnimation();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Procesando busqueda",Toast.LENGTH_LONG).show();

                    DevolverBusqueda(palabra);
                    lvReproductor.setAdapter(adaptador);
                }

            }
        });



    }

    public void DevolverListaReproducción(){

        adaptador=new Adaptador(lista.DevolverLista(),this);
    }

    public void DevolverBusqueda(String Cancion){

        adaptador=new Adaptador(lista.DevolverListaBusqueda(Cancion),this);
    }
}

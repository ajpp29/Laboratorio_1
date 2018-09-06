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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Variables a utilizar
    Button btnReproductor;
    Button btnPlaylist;
    Button btnAgregarPlaylist;
    EditText tbCancion;
    EditText tbPlaylist;
    Button btnBuscar;
    MusicList lista;
    private ListView lvReproductor;
    private Adaptador adaptador;
    private Adaptador adaptadorPL;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaración de variables
        btnReproductor=(Button) findViewById(R.id.btnReproduccion);
        btnBuscar=(Button) findViewById(R.id.btnBuscar);
        btnAgregarPlaylist=(Button) findViewById(R.id.btnAgregarPlaylist);
        btnPlaylist=(Button) findViewById(R.id.btnPlaylist);
        tbCancion=(EditText) findViewById(R.id.tbCancionBuscada);
        tbPlaylist=(EditText) findViewById(R.id.tbCancionPlaylist);
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

                tbCancion.setText("");

            }
        });


        btnPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DevolverPlayList();
                lvReproductor.setAdapter(adaptadorPL);


            }
        });

        btnAgregarPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String palabra=tbPlaylist.getText().toString().toLowerCase();
                boolean agregado = lista.AgregarPlayList(palabra);

                if(agregado)
                    Toast.makeText(getApplicationContext(),"El elemento se agrego a la playlist",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"El elemento no existe o se encuentra ya incluido en la playlist",Toast.LENGTH_LONG).show();

                DevolverPlayList();
                lvReproductor.setAdapter(adaptadorPL);

                tbPlaylist.setText("");
            }
        });

        tbCancion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LimpiarReproductor();
                lvReproductor.setAdapter(adaptador);
            }
        });

        tbPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LimpiarPlaylist();
                lvReproductor.setAdapter(adaptadorPL);
            }
        });


    }

    public void DevolverListaReproducción(){

        adaptador=new Adaptador(lista.DevolverLista(),this);
    }

    public void DevolverBusqueda(String Cancion){

        adaptador=new Adaptador(lista.DevolverListaBusqueda(Cancion),this);
    }

    public void DevolverPlayList(){

        adaptadorPL=new Adaptador(lista.DevolverPlayList(),this);
    }

    public void LimpiarPlaylist(){
        ArrayList<Cancion> list=new ArrayList<Cancion>();

        adaptadorPL=new Adaptador(list,this);
    }

    public void LimpiarReproductor(){
        ArrayList<Cancion> list=new ArrayList<Cancion>();

        adaptador=new Adaptador(list,this);
    }
}

package com.example.angel.laboratorio1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button btnReproductor;
    MusicList lista;

    private ListView lvReproductor;
    private Adaptador adaptador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReproductor=(Button) findViewById(R.id.btnReproduccion);
        lista=new MusicList();
        lvReproductor= (ListView) findViewById(R.id.lvListaCanciones);
        lista.IniciarReproductor();
        adaptador=new Adaptador(lista.DevolverLista(),this);


        btnReproductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                lvReproductor.setAdapter(adaptador);
            }
        });

    }
}

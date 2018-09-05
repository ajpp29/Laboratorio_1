package com.example.angel.laboratorio1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnReproductor;
    MusicList lista;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReproductor=(Button) findViewById(R.id.btnReproduccion);
        lista=new MusicList();

        btnReproductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lista.IniciarReproductor();
            }
        });

    }
}

package com.example.angel.laboratorio1;


import android.support.v7.util.SortedList;

import java.util.LinkedList;

public class MusicList {

    public LinkedList<Cancion> ListaReproduccion;

    Cancion cancion1;
    Cancion cancion2;
    Cancion cancion3;
    Cancion cancion4;
    Cancion cancion5;
    Cancion cancion6;
    Cancion cancion7;
    Cancion cancion8;
    Cancion cancion9;
    Cancion cancion10;

    public MusicList(){
        LinkedList<Cancion> ListaReproduccion= new LinkedList<Cancion>();

        cancion1=new Cancion("animals",5.04,"Martin Garrix");
        cancion2=new Cancion("all falls down",3.19,"Alan Walker,Noah Cyrus");
        cancion3=new Cancion("born to be yours",3.13,"Kygo,Imagine Dragons");
        cancion4=new Cancion("closer",4.04,"The Chainsmokers");
        cancion5=new Cancion("feels",3.43,"Calvin Harris,Pharrell Williams");
        cancion6=new Cancion("go to sleep",3.12,"John DE Sohn");
        cancion7=new Cancion("in my mind",3.04,"Dynoro,Gigi D'Agostino");
        cancion8=new Cancion("lie to me",2.59,"Steve Aoki,Ina Wroldsen");
        cancion9=new Cancion("ocean",3.36,"Martin Garrix,Khalid");
        cancion10=new Cancion("only you",3.09,"Cheat Codes,Little Mix");
        IniciarReproductor();
    }

    public void IniciarReproductor(){
        ListaReproduccion.add(cancion1);
        ListaReproduccion.add(cancion2);
        ListaReproduccion.add(cancion3);
        ListaReproduccion.add(cancion4);
        ListaReproduccion.add(cancion5);
        ListaReproduccion.add(cancion6);
        ListaReproduccion.add(cancion7);
        ListaReproduccion.add(cancion8);
        ListaReproduccion.add(cancion9);
        ListaReproduccion.add(cancion10);
    }
}

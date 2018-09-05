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

        cancion1=new Cancion("animals",4,"Martin Garrix");
        cancion2=new Cancion("all falls down",4,"Alan Walker,Noah Cyrus");
        cancion3=new Cancion("born to be yours",4,"Kygo,Imagine Dragons");
        cancion4=new Cancion("closer",4,"The Chainsmokers");
        cancion5=new Cancion("feels",4,"Calvin Harris,Pharrell Williams");
        cancion6=new Cancion("go to sleep",4,"John DE Sohn");
        cancion7=new Cancion("in my mind",4,"Dynoro,Gigi D'Agostino");
        cancion8=new Cancion("lie to me",4,"Steve Aoki,Ina Wroldsen");
        cancion9=new Cancion("ocean",4,"Martin Garrix,Khalid");
        cancion10=new Cancion("only you",4,"Cheat Codes,Little Mix");
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

package com.example.angel.laboratorio1;


import android.support.v7.util.SortedList;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MusicList {

    public LinkedList<Cancion> ListaReproduccion;
    public LinkedList<Cancion> Playlist;

    private int icancionesplaylist;

    private Cancion cancion1;
    private Cancion cancion2;
    private Cancion cancion3;
    private Cancion cancion4;
    private Cancion cancion5;
    private Cancion cancion6;
    private Cancion cancion7;
    private Cancion cancion8;
    private Cancion cancion9;
    private Cancion cancion10;

    public MusicList(){
        icancionesplaylist=0;
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
        ListaReproduccion= new LinkedList<Cancion>();
        Playlist= new LinkedList<Cancion>();
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

    public ArrayList<Cancion> DevolverLista(){
        ArrayList<Cancion> list = new ArrayList<Cancion>();
        list.add(cancion1);
        list.add(cancion2);
        list.add(cancion3);
        list.add(cancion4);
        list.add(cancion5);
        list.add(cancion6);
        list.add(cancion7);
        list.add(cancion8);
        list.add(cancion9);
        list.add(cancion10);

        return list;
    }


    public ArrayList<Cancion> DevolverListaBusqueda(String cancionbuscada) {
        int icontador = 0;

        ArrayList<Cancion> list = new ArrayList<Cancion>();

        for(int i =0;i<10;++i){

            if(ListaReproduccion.get(i).getsNombre().equals(cancionbuscada)){
                list.add(ListaReproduccion.get(i));
                ++icontador;
            }
        }

        if(icontador==0)
            return null;
        else
            return list;
    }


    public boolean AgregarPlayList(String sCancion){

        boolean agregado=false;
        boolean encontrado=false;

        for(int i =0;i<icancionesplaylist;++i){
            if(Playlist.get(i).getsNombre().equals(sCancion)){
                encontrado=true;
                agregado=false;
            }
        }

        for(int i =0;i<10;++i){
            if(ListaReproduccion.get(i).getsNombre().equals(sCancion) && encontrado!=true){

                Playlist.add(ListaReproduccion.get(i));
                agregado=true;
                ++icancionesplaylist;
            }
        }
        return agregado;
    }

    public ArrayList<Cancion> DevolverPlayList(){

        ArrayList<Cancion> list = new ArrayList<Cancion>();

        for(int i =0;i<icancionesplaylist;++i){

            list.add(Playlist.get(i));
        }

        return list;
    }
}

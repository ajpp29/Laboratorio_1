package com.example.angel.laboratorio1;

public class Cancion {

    private String sNombre;
    private int iDuración;
    private String sAutor;

    public Cancion()
    {
        sNombre=null;
        iDuración=0;
        sAutor=null;
    }

    public Cancion(String Nombre,int Duracion, String Autor)
    {
        sNombre=Nombre;
        iDuración=Duracion;
        sAutor=Autor;
    }

    public String getsAutor() {
        return sAutor;
    }

    public int getiDuración() {
        return iDuración;
    }

    public String getsNombre() {
        return sNombre;
    }
}

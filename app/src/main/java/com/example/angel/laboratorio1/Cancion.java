package com.example.angel.laboratorio1;

public class Cancion {

    private string sNombre;
    private int iDuración;
    private string sAutor;

    public Cancion()
    {
        sNombre=null;
        iDuración=0;
        sAutor=null;
    }

    public Cancion(string Nombre,int Duracion, string Autor)
    {
        sNombre=Nombre;
        iDuración=Duracion;
        sAutor=Autor;
    }

    public string getsAutor() {
        return sAutor;
    }

    public int getiDuración() {
        return iDuración;
    }

    public string getsNombre() {
        return sNombre;
    }
}

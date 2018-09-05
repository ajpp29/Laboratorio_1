package com.example.angel.laboratorio1;

public class Cancion {

    private String sNombre;
    private double dDuración;
    private String sAutor;

    public Cancion()
    {
        sNombre=null;
        dDuración=0;
        sAutor=null;
    }

    public Cancion(String Nombre,double Duracion, String Autor)
    {
        sNombre=Nombre;
        dDuración=Duracion;
        sAutor=Autor;
    }

    public String getsAutor() {
        return sAutor;
    }

    public double getiDuración() {
        return dDuración;
    }

    public String getsNombre() {
        return sNombre;
    }
}

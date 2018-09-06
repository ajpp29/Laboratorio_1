package com.example.angel.laboratorio1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends BaseAdapter{

    private ArrayList<Cancion> listItems;
    private Context context;

    public Adaptador(ArrayList<Cancion> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cancion cancion= (Cancion) getItem(position);

        convertView= LayoutInflater.from(context).inflate(R.layout.item,null);
        TextView tvTitulo= (TextView) convertView.findViewById(R.id.tvTitulo);
        TextView tvDuracion= (TextView) convertView.findViewById(R.id.tvDuracion);
        TextView tvAutor = (TextView) convertView.findViewById(R.id.tvAutor);

        tvTitulo.setText(cancion.getsNombre());
        tvDuracion.setText(String.valueOf(cancion.getiDuración()));
        tvAutor.setText(cancion.getsAutor());

        return convertView;
    }
}

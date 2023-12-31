package com.example.pablorodriguexex2ev1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ElementoAdapter extends ArrayAdapter<Elemento> {

    private final LayoutInflater inflater;

    public ElementoAdapter(Context context, List<Elemento> elementos) {
        super(context, 0, elementos);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = inflater.inflate(R.layout.elemento, parent, false);
        }

        Elemento elemento = getItem(position);

        ImageView imageView = itemView.findViewById(R.id.imageView);
        TextView textView = itemView.findViewById(R.id.textView);
        TextView textView2 = itemView.findViewById(R.id.textView2);
        if (elemento != null) {
            imageView.setImageResource(elemento.getImagen());
            textView.setText(elemento.getNombre());
            textView2.setText(String.valueOf(elemento.getPrecio()));
        }

        return itemView;
    }
}

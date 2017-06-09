package com.example.fondn.listviewcustomwithbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] name;
    int[] imag;
    LayoutInflater inflater=null;

    public CustomAdapter(Context context, String[] name, int[] imag) {
        this.context = context;
        this.name = name;
        this.imag = imag;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.layout,null);
        TextView textView;
        ImageView imageView;

        textView = (TextView) convertView.findViewById(R.id.textViewLid);
        imageView = (ImageView) convertView.findViewById(R.id.imageViewLid);

        textView.setText(name[position]);
        imageView.setImageResource(imag[position]);
        return convertView;
    }
}

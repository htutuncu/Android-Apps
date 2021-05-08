package com.example.catalog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    ArrayList<Product> products;
    private Activity context;

    public CustomAdapter(ArrayList<Product> products, Activity context){
        super(context,R.layout.custom_view,products);
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view,null,true);

        TextView nameView = customView.findViewById(R.id.customTextView);
        nameView.setText(products.get(position).getName());

        return customView;
    }
}

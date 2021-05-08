package com.example.catalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        Product macbook_pro = new Product("Macbook Pro 16\" ","1099",R.drawable.macbookpro);
        Product asus_monitor = new Product("Asus Monitor","499",R.drawable.monitor);
        Product ipad = new Product("iPad Pro 2020 256 GB","799",R.drawable.ipad);
        Product iphone = new Product("iPhone 12 Pro Max 512 GB","799",R.drawable.iphone12pro);

        ArrayList<Product> products = new ArrayList<>();
        products.add(macbook_pro);
        products.add(asus_monitor);
        products.add(ipad);
        products.add(iphone);

        CustomAdapter customAdapter = new CustomAdapter(products,MainActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);

                intent.putExtra("selectedProduct",products.get(position));

                startActivity(intent);
            }
        });
    }
}
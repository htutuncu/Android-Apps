package com.example.catalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        Product selectedProduct = (Product)intent.getSerializableExtra("selectedProduct");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),selectedProduct.getImageID());
        imageView.setImageBitmap(bitmap);

        textView.setText(selectedProduct.getName());
        textView2.setText(selectedProduct.getPrice() + " $");

    }
}
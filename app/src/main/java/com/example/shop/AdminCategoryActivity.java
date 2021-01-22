package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class
AdminCategoryActivity extends AppCompatActivity {

    private ImageView dress, jumpsuit, top, shoe, heel, flat, handbag, wallet, backpack, accessory, watch, skirt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        dress = (ImageView) findViewById(R.id.dress);
        skirt = (ImageView) findViewById(R.id.skirt);
        top = (ImageView) findViewById(R.id.top);
        jumpsuit = (ImageView) findViewById(R.id.jumpsuit);
        shoe = (ImageView) findViewById(R.id.shoe);
        heel = (ImageView) findViewById(R.id.heel);
        flat = (ImageView) findViewById(R.id.flat);
        handbag = (ImageView) findViewById(R.id.handbag);
        wallet = (ImageView) findViewById(R.id.wallet);
        backpack = (ImageView) findViewById(R.id.backpack);
        accessory = (ImageView) findViewById(R.id.accessory);
        watch = (ImageView) findViewById(R.id.watch);

       dress.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Dresses");
               startActivity(intent);
           }
       });


       jumpsuit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                   Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                   intent.putExtra("category","Jumpsuits");
                   startActivity(intent);
           }
       });


        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Tops");
                startActivity(intent);
            }
        });


        shoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category","Shoes");
                startActivity(intent);
            }
        });


       heel.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Heels");
               startActivity(intent);
           }
       });


       flat.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Flats");
               startActivity(intent);
           }
       });


       handbag.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Handbags");
               startActivity(intent);
           }
       });


       wallet.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Wallets");
               startActivity(intent);
           }
       });


       backpack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Backpacks");
               startActivity(intent);
           }
       });


       accessory.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Accessories");
               startActivity(intent);
           }
       });

       watch.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Watches");
               startActivity(intent);
           }
       });
       skirt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
               intent.putExtra("category","Skirts");
               startActivity(intent);
           }
       });
    }
}
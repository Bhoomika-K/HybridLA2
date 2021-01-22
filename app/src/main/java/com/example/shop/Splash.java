package com.example.shop;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;

import com.example.shop.Model.Users;
import com.example.shop.Prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import io.paperdb.Paper;

public class Splash extends AppCompatActivity {

    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Paper.init(this);
        loadingBar = new ProgressDialog(this);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent= new Intent(Splash.this, MainActivity.class);
               startActivity(intent);

               finish();
           }
       },3000);

    }

}
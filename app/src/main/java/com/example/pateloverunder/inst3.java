package com.example.pateloverunder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inst3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst3);
    }
    public void next(View view) {
        Intent i = new Intent(this, inst4.class);
        startActivity(i);


    }
}

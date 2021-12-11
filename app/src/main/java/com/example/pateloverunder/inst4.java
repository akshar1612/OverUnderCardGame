package com.example.pateloverunder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inst4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst4);
    }
    public void next(View view) {
        Intent i = new Intent(this, game.class);
        startActivity(i);


    }
}

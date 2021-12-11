package com.example.pateloverunder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inst2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inst2);
    }

    public void next(View view) {
        Intent i = new Intent(this, inst3.class);

        startActivity(i);


    }
}

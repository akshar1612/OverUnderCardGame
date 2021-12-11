package com.example.pateloverunder;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class end extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void exit (View view){

        finishAffinity();
    }
}

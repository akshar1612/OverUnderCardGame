package com.example.pateloverunder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.*;


public class playerName extends AppCompatActivity {
    PrintWriter out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);
    }

    public void next(View view){
        EditText p1name = (EditText) findViewById(R.id.p1);
        EditText p2name = (EditText) findViewById(R.id.p2);

        String pp1 = p1name+"";
        String pp2 = p2name+"";


        try {
            FileOutputStream out = openFileOutput("data.txt", Activity.MODE_PRIVATE);
            out.write(Integer.parseInt(pp1));
            out.write(Integer.parseInt(pp2));
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace(); }


    Intent i = new Intent(this, inst1.class);
    startActivity(i);





}}

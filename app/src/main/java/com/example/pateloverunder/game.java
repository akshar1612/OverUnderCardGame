package com.example.pateloverunder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class game extends AppCompatActivity {

    Deck d = new Deck();

    int score1 = 0;
    int score2 = 0;
    int g;
    int t;
    char overunder = 'u';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        display();

    }

    public void display() {
        Card c = d.pop();
        TextView question = (TextView) findViewById(R.id.question);
        TextView answer = (TextView) findViewById(R.id.answer);
        question.setText(c.getQuestions());
        answer.setText(c.getFake() + "");
        g = c.getAns();
        t = c.getFake();

    }

    public void title(View view) {

        display();

    }

    public void over(View view) {

        if (g > t)
            overunder = 'u';
        else
            overunder = 'o';

        TextView response = (TextView) findViewById(R.id.response);

        if (overunder == 'o') {
            response.setText("Correct. The real answer was " + g + ". Who got the point");


        } else {
            response.setText("Incorrect. The real answer was " + g);
        }

        //TextView scor = (TextView)findViewById(R.id.scor);
        //scor.setText("You got "+score + " out of " + howmany);


    }

    public void under(View view) {
        if (g > t)
            overunder = 'u';
        else
            overunder = 'o';

        TextView response = (TextView) findViewById(R.id.response);

        if (overunder == 'u') {
            response.setText("Correct. The real answer was " + g + ". Who got the point");

        } else {
            response.setText("Incorrect. The real answer was " + g);
        }


    }

    public void p1Click(View view) {

        score1++;
        TextView p1Click = (TextView) findViewById(R.id.p1Click);
        p1Click.setText("Player 1: " + score1);

    }

    public void p2Click(View view) {

        score2++;
        TextView p2Click = (TextView) findViewById(R.id.p2Click);
        p2Click.setText("Player 2: " + score2);

    }

    public void next(View vire) {

        Intent i = new Intent(this, end.class);

        startActivity(i);

    }

    public void reset(View view) {

        TextView p1Click = (TextView) findViewById(R.id.p1Click);
        TextView p2Click = (TextView) findViewById(R.id.p2Click);
        TextView response = (TextView) findViewById(R.id.response);
        score1 = 0;
        p1Click.setText("Player 1: " + score1);
        score2 = 0;
        p2Click.setText("Player 2: " + score2);
        response.setText("");


        display();


    }

    public void score(View view) {

        try {
            FileInputStream in = openFileInput("data.txt");
            String display = "";
            String display2 = "";
            display = in.read() + "";
            display2 = in.read() + "";
            in.close();
            TextView p1Click = (TextView) findViewById(R.id.p1Click);
            p1Click.setText(display);
            TextView p2Click = (TextView) findViewById(R.id.p2Click);
            p2Click.setText(display2);
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

}


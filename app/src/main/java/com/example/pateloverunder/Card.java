package com.example.pateloverunder;

public class Card {
    private String questions;
    private int fake;
    private int ans;
    private int score;

    public Card(String q, int f, int a) {

        questions = q;
        fake = f;
        ans = a;
        score = 0;

    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String q){

        q = questions;

    }

    public int getAns() {


        return ans;
    }

    public void setAns(int a){

        ans = a;

    }

    public int getFake() {


        return fake;


    }

    public void setFake(int f){

        fake = f;

    }

    public void addtoScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int s){

        score = s;

    }

    public int compareTo (Card two) {
        if (two.equals(this))
            return 0;
        else if (two.getAns()>= ans)
            return 1;
        else
            return -1;
    }




}

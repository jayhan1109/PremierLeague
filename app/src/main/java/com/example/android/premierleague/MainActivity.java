package com.example.android.premierleague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int barcelonaScore, barcelonaGoal, barcelonaFoul = 0;
    int realScore, realGoal, realFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayRealMadridScore(0);
        displayBarcelonaScore(0);
    }

    public void displayBarcelonaScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRealMadridScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rmScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBarcelonaGoal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barGoal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRealMadridGoal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rmGoal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBarcelonaFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barFoul);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRealMadridFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rmFoul);
        scoreView.setText(String.valueOf(score));
    }

    public void addBarGoal(View view) {
        barcelonaGoal++;
        barcelonaScore++;
        displayBarcelonaScore(barcelonaScore);
        displayBarcelonaGoal(barcelonaGoal);
    }

    public void addBarFoul(View view) {
        barcelonaFoul++;
        barcelonaScore--;
        displayBarcelonaFoul(barcelonaFoul);
        displayBarcelonaScore(barcelonaScore);
    }

    public void addRmGoal(View view) {
        realScore++;
        realGoal++;
        displayRealMadridScore(realScore);
        displayRealMadridGoal(realGoal);
    }

    public void addRmFoul(View view) {
        realFoul++;
        realScore--;
        displayRealMadridFoul(realFoul);
        displayRealMadridScore(realScore);
    }

    public void resetButton(View v) {
        realScore = 0;
        realGoal = 0;
        realFoul = 0;
        barcelonaGoal = 0;
        barcelonaFoul = 0;
        barcelonaScore = 0;
        displayBarcelonaScore(barcelonaScore);
        displayRealMadridScore(realScore);
        displayBarcelonaGoal(barcelonaGoal);
        displayRealMadridGoal(realGoal);
        displayBarcelonaFoul(barcelonaFoul);
        displayRealMadridFoul(realFoul);
    }
}

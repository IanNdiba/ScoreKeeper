package com.example.ian.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int manuScore = 0;
    private int manCityScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //manu display
    public void displayManUScore(int score) {
        TextView manuView = (TextView) findViewById(R.id.manuTextView);
        manuView.setText(String.valueOf(score));
    }

    //manu fouls button
    public void foulsManu(View v) {
        manuScore = manuScore - 1;
        displayManUScore(manuScore);
        Toast.makeText(this, "Button Foul Clicked", Toast.LENGTH_SHORT).show();
    }

    //manu penalty button
    public void penaltyButton(View v) {
        manuScore = manuScore + 1;
        displayManUScore(manuScore);
        Toast.makeText(this, "Button Penalty Clicked", Toast.LENGTH_SHORT).show();
    }

    //manu goal button
    public void goalButton(View v) {
        manuScore = manuScore + 1;
        displayManUScore(manuScore);
        Toast.makeText(this, "Button Goal Clicked", Toast.LENGTH_SHORT).show();
    }


    //mancity display
    public void displayManCityScore(int score) {
        TextView mancityView = (TextView) findViewById(R.id.mancityTextView);
        mancityView.setText(String.valueOf(score));
    }

    //mancity fouls button
    public void foulsManCity(View v) {
        manCityScore = manCityScore - 1;
        displayManCityScore(manCityScore);
        Toast.makeText(this, "Button Foul Clicked", Toast.LENGTH_SHORT).show();
    }

    //mancity penalty button
    public void penaltyManCityButton(View v) {
        manCityScore = manCityScore + 1;
        displayManCityScore(manCityScore);
        Toast.makeText(this, "Button Penalty Clicked", Toast.LENGTH_SHORT).show();
    }

    //mancity goal button
    public void goalManCityButton(View v) {
        manCityScore = manCityScore + 1;
        displayManCityScore(manCityScore);
        Toast.makeText(this, "Button Goal Clicked", Toast.LENGTH_SHORT).show();
    }

    //reset method
    public void resetMethod(View v){
        manuScore = 0;
        manCityScore = 0;
        displayManUScore(manuScore);
        displayManCityScore(manCityScore);
    }
}

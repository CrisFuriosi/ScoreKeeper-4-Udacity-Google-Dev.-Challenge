package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** Variables declaration */

    int team1score = 0;
    int team1fouls = 0;
    int team2score = 0;
    int team2fouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**************************************************************************/

    /** Displays the given score for Team 1. */

    public void displayScoreTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the team1_plus_score button is clicked.
     */
    public void add1ToTeam1Score (View view) {
        team1score = team1score + 1;
        displayScoreTeam1(team1score);
    }

    /** Displays the given score for Team 2. */

    public void displayScoreTeam2(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_2_score);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * This method is called when the team2_plus_score button is clicked.
     */
    public void add1ToTeam2Score (View view) {
        team2score = team2score + 1;
        displayScoreTeam2(team2score);
    }

    /**************************************************************************/

    /** Displays the fouls for Team 1. */

    public void displayFoulsTeam1(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_1_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * This method is called when the team1_plus_fouls button is clicked.
     */
    public void add1ToTeam1Fouls (View view) {
        team1fouls = team1fouls + 1;
        displayFoulsTeam1(team1fouls);
    }

    /** Displays the fouls for Team 2. */

    public void displayFoulsTeam2(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_2_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * This method is called when the team2_plus_fouls button is clicked.
     */
    public void add1ToTeam2Fouls (View view) {
        team2fouls = team2fouls + 1;
        displayFoulsTeam2(team2fouls);
    }

    /**************************************************************************/

    /**
     * This method is called when the Reset button is clicked.
     */
    public void resetScore (View view) {
        team1score = 0;
        team2score = 0;
        team1fouls = 0;
        team2fouls = 0;

        displayScoreTeam1(team1score);
        displayScoreTeam2(team2score);

        displayFoulsTeam1(team1fouls);
        displayFoulsTeam2(team2fouls);
    }


}
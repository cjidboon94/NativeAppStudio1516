package com.example.tafgh.myfirstapp;

import android.app.Application;

/**
 * Created by Cornelis Boon on 9/4/15.
 */
public class GuessApp extends Application {

    int secret;
    int correct;


    public void setSecret(int secret){
        //Setter function for the number that needs to be guessed.
        this.secret = secret;
    }

    public int getCorrect(){
        return this.correct;
    }

    public void setCorrect(int guess){
        //Sets the value if it is correct or not.
        if(guess > this.secret){
            this.correct = 1;
        } else if(guess < this.secret) {
            this.correct = -1;
        } else {
            this.correct = 0;
        }
    }

}

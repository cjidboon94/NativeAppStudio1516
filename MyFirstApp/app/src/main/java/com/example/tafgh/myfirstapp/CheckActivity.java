package com.example.tafgh.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CheckActivity extends Activity {

    TextView result;
    GuessApp guesser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        result = (TextView) findViewById(R.id.resultText);
        guesser = (GuessApp) this.getApplication();
        String resultText = setResultText(guesser.getCorrect());

        result.setText(resultText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_check, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goBack(View view){
        finish();
    }


    private String setResultText(int correct){
    //Checks if the answer is too high, too low or correct and returns the required string.
        if(correct == 1){
            return "Sorry, seems like you guessed too high. Try again.";
        } else if(correct == -1){
            return "Sorry, seems like you guessed too low. Try again.";
        } else
        {
            return "Good job! You guessed correctly. You rock!";
        }
    }

}

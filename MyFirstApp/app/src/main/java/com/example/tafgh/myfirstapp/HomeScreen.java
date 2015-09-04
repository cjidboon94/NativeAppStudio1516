package com.example.tafgh.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import java.util.Random;
import java.lang.Integer;

public class HomeScreen extends Activity {


    EditText numberField;
    Button sendButton;
    GuessApp guesser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        numberField = (EditText) findViewById(R.id.numberField);
        sendButton = (Button) findViewById(R.id.sendButton);
        guesser = (GuessApp) this.getApplication();

        //Generates and saves the number that needs to be guessed.
        guesser.setSecret(new Random().nextInt(1001));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
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

    public void onClickCheck(View view) {
        if (!numberField.getText().toString().equals("")) {
            int guess = Integer.parseInt(numberField.getText().toString());
            guesser.setCorrect(guess);

            Intent intent = new Intent(this, CheckActivity.class);
            startActivity(intent);

        }
    }

    public void onClickReplay(View view) {
        //Generates a new secret number to be guessed.
        guesser.setSecret(new Random().nextInt(1001));
    }
}

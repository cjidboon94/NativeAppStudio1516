package com.nas.cornelis.mrpotatohead;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends Activity {
    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onCheckboxClicked (View view){
        //
        CheckBox cb = (CheckBox) view;
        boolean checked = cb.isChecked();
        ImageView image;

        switch(view.getId()) {
            case R.id.armsBox :
                image = (ImageView) findViewById(R.id.imageArms);
                setImageVisibility(checked, image);
                break;
            case R.id.earsBox :
                image = (ImageView) findViewById(R.id.imageEars);
                setImageVisibility(checked, image);
                break;
            case R.id.bodyBox :
                image = (ImageView) findViewById(R.id.imageBody);
                setImageVisibility(checked, image);
                break;
            case R.id.browsBox :
                image = (ImageView) findViewById(R.id.imageBrows);
                setImageVisibility(checked, image);
                break;
            case R.id.eyesBox :
                image = (ImageView) findViewById(R.id.imageEyes);
                setImageVisibility(checked, image);
                break;
            case R.id.glassesBox :
                image = (ImageView) findViewById(R.id.imageGlasses);
                setImageVisibility(checked, image);
                break;
            case R.id.hatBox :
                image = (ImageView) findViewById(R.id.imageHat);
                setImageVisibility(checked, image);
                break;
            case R.id.mouthBox :
                image = (ImageView) findViewById(R.id.imageMouth);
                setImageVisibility(checked, image);
                break;
            case R.id.noseBox :
                image = (ImageView) findViewById(R.id.imageNose);
                setImageVisibility(checked, image);
                break;
            case R.id.stacheBox :
                image = (ImageView) findViewById(R.id.imageStache);
                setImageVisibility(checked, image);
                break;
            case R.id.shoesBox :
                image = (ImageView) findViewById(R.id.imageShoes);
                setImageVisibility(checked, image);
                break;
        }
    }


    private void setImageVisibility(boolean checked, ImageView image){
        if(checked){
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }

}

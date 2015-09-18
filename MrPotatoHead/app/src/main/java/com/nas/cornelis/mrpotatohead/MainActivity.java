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
    PotatoHeadApp PHapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PHapp = (PotatoHeadApp) this.getApplication();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
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
    public void setupView() {
        boolean arms = PHapp.getArms();
        boolean ears = PHapp.getEars();
        boolean body = PHapp.getBody();
        boolean brows = PHapp.getBrows();
        boolean eyes = PHapp.getEyes();
        boolean hat = PHapp.getHat();
        boolean mouth = PHapp.getMouth();
        boolean glasses = PHapp.getGlasses();
        boolean stache = PHapp.getStache();
        boolean shoes = PHapp.getShoes();
        boolean nose = PHapp.getNose();

        ((CheckBox) findViewById(R.id.armsBox)).setChecked(arms);
        ((CheckBox) findViewById(R.id.earsBox)).setChecked(ears);
        ((CheckBox) findViewById(R.id.bodyBox)).setChecked(body);
        ((CheckBox) findViewById(R.id.browsBox)).setChecked(brows);
        ((CheckBox) findViewById(R.id.eyesBox)).setChecked(eyes);
        ((CheckBox) findViewById(R.id.hatBox)).setChecked(hat);
        ((CheckBox) findViewById(R.id.mouthBox)).setChecked(mouth);
        ((CheckBox) findViewById(R.id.glassesBox)).setChecked(glasses);
        ((CheckBox) findViewById(R.id.stacheBox)).setChecked(stache);
        ((CheckBox) findViewById(R.id.shoesBox)).setChecked(shoes);
        ((CheckBox) findViewById(R.id.noseBox)).setChecked(nose);

        setImageVisibility(arms, (ImageView) findViewById(R.id.imageArms));
        setImageVisibility(ears, (ImageView) findViewById(R.id.imageEars));
        setImageVisibility(body, (ImageView) findViewById(R.id.imageBody));
        setImageVisibility(brows, (ImageView) findViewById(R.id.imageBrows));
        setImageVisibility(eyes, (ImageView) findViewById(R.id.imageEyes));
        setImageVisibility(hat, (ImageView) findViewById(R.id.imageHat));
        setImageVisibility(mouth, (ImageView) findViewById(R.id.imageMouth));
        setImageVisibility(glasses, (ImageView) findViewById(R.id.imageGlasses));
        setImageVisibility(stache, (ImageView) findViewById(R.id.imageStache));
        setImageVisibility(shoes, (ImageView) findViewById(R.id.imageShoes));
        setImageVisibility(nose, (ImageView) findViewById(R.id.imageNose));
    }
    public void onCheckboxClicked (View view){
        //
        CheckBox cb = (CheckBox) view;
        boolean checked = cb.isChecked();
        ImageView image;

        switch(view.getId()) {
            case R.id.armsBox :
                PHapp.setArms(checked);
                image = (ImageView) findViewById(R.id.imageArms);
                setImageVisibility(checked, image);
                break;
            case R.id.earsBox :
                PHapp.setEars(checked);
                image = (ImageView) findViewById(R.id.imageEars);
                setImageVisibility(checked, image);
                break;
            case R.id.bodyBox :
                PHapp.setBody(checked);
                image = (ImageView) findViewById(R.id.imageBody);
                setImageVisibility(checked, image);
                break;
            case R.id.browsBox :
                PHapp.setBrows(checked);
                image = (ImageView) findViewById(R.id.imageBrows);
                setImageVisibility(checked, image);
                break;
            case R.id.eyesBox :
                PHapp.setEyes(checked);
                image = (ImageView) findViewById(R.id.imageEyes);
                setImageVisibility(checked, image);
                break;
            case R.id.glassesBox :
                PHapp.setGlasses(checked);
                image = (ImageView) findViewById(R.id.imageGlasses);
                setImageVisibility(checked, image);
                break;
            case R.id.hatBox :
                PHapp.setHat(checked);
                image = (ImageView) findViewById(R.id.imageHat);
                setImageVisibility(checked, image);
                break;
            case R.id.mouthBox :
                PHapp.setMouth(checked);
                image = (ImageView) findViewById(R.id.imageMouth);
                setImageVisibility(checked, image);
                break;
            case R.id.noseBox :
                PHapp.setNose(checked);
                image = (ImageView) findViewById(R.id.imageNose);
                setImageVisibility(checked, image);
                break;
            case R.id.stacheBox :
                PHapp.setStache(checked);
                image = (ImageView) findViewById(R.id.imageStache);
                setImageVisibility(checked, image);
                break;
            case R.id.shoesBox :
                PHapp.setShoes(checked);
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

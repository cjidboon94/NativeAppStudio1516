package com.nas.cornelis.mrpotatohead;

import android.app.Application;

/**
 * Created by tafgh on 9/18/15.
 */
public class PotatoHeadApp extends Application {

    private boolean arms = false;
    private boolean brows = false;
    private boolean ears = false;
    private boolean body = false;
    private boolean eyes = false;
    private boolean glasses = false;
    private boolean hat = false;
    private boolean mouth = false;
    private boolean nose  = false;
    private boolean stache =false;
    private boolean shoes = false;


    public void setArms(boolean checked){
        this.arms = checked;
    }
    public boolean getArms(){
        return this.arms;
    }
    public void setBrows(boolean checked){
        this.brows = checked;
    }
    public boolean getBrows(){
        return this.brows;
    }
    public void setEars(boolean checked){
        this.ears = checked;
    }
    public boolean getEars(){
        return this.ears;
    }
    public void setBody(boolean checked){
        this.body = checked;
    }
    public boolean getBody(){
        return this.body;
    }
    public void setEyes(boolean checked){
        this.eyes = checked;
    }
    public boolean getEyes(){
        return this.eyes;
    }
    public void setGlasses(boolean checked){
        this.glasses = checked;
    }
    public boolean getGlasses(){
        return this.glasses;
    }
    public void setHat(boolean checked){
        this.hat = checked;
    }
    public boolean getHat(){
        return this.hat;
    }
    public void setNose(boolean checked){
        this.nose = checked;
    }
    public boolean getNose(){
        return this.nose;
    }
    public void setMouth(boolean checked){
        this.mouth = checked;
    }
    public boolean getMouth(){
        return this.mouth;
    }
    public void setShoes(boolean checked){
        this.shoes = checked;
    }
    public boolean getShoes(){
        return this.shoes;
    }
    public void setStache(boolean checked){
        this.stache = checked;
    }
    public boolean getStache(){
        return this.stache;
    }

}

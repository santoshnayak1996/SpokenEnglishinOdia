package com.odiawordbook.spokenenglishinodia;

public class word {

    private String mDefaultTranslation;
    private String mOdiaTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    /* this constructor is for phrase that dont need an image     coded by:- santosh nayak*/

    public word(String defaultTranslation, String odiaTranslation){
        mDefaultTranslation = defaultTranslation;
        mOdiaTranslation = odiaTranslation;
    }


    /* this constructor is for color,number,family that need an image */

    public word(String defaultTranslation, String odiaTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mOdiaTranslation = odiaTranslation;
        mImageResourceId = imageResourceId;
    }



    /*public getters */

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmOdiaTranslation() {
        return mOdiaTranslation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }
}


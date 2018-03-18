package com.example.android.miwok;

/**
 * Created by gp on 12/03/2018.
 */

public class Word {

    //default translation (any language a user knows / has set / is using)
    private String mDefaultTranslation;

    //miwok translation
    private String mMiwokTranslation;

    //image relating to text
    private int mImageResourceId;

    // create Word object
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;

    }

    //get default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public Integer getImageRescourceId() {
        return mImageResourceId;
    }
}



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
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    //Lesson 7.13 image existence variable
    private static int NO_IMAGE_PROVIDED = -1;



    // create Word object for 4 types of data
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    // create a second Word object for 3 types of data
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //get default translation
    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    //get miwok translation
    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    public Integer getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    };

}



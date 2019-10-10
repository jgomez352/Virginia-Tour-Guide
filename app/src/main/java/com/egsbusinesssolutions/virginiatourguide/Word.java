package com.egsbusinesssolutions.virginiatourguide;

/**
 * Created by Jose F. Gomez on 8/28/2018.
 */
public class Word {

    private String mLocationName;
    private String mLocationPhone;
    private String mLocationAddress;

    //Image Management
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -5;

    public Word(String LocationName,String LocationPhone, String LocationAddress ){
        mLocationName = LocationName;
        mLocationPhone = LocationPhone;
        mLocationAddress = LocationAddress;
    }
    public Word(String LocationName,String LocationPhone, String LocationAddress, int ImageRexourceId ){
        mLocationName = LocationName;
        mLocationPhone = LocationPhone;
        mLocationAddress = LocationAddress;
        mImageResourceId = ImageRexourceId;
    }

    public String getmLocationName() {
        return mLocationName;
    }
    public String getmLocationPhone() {
        return mLocationPhone;
    }
    public String getmLocationAddress() {
        return mLocationAddress;
    }
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    //Return true or false if image is available
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }
}

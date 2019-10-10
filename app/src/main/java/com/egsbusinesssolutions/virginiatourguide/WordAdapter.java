package com.egsbusinesssolutions.virginiatourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jose F. Gomez on 8/28/2018.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResouceId;

    public WordAdapter (Activity context, ArrayList<Word> words, int ColorResourceId){
        super(context, 0, words);
        mColorResouceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //check to see if the view can be reused
        View listItemView =convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get object at the current location on the list
        Word currentWord = getItem(position);

        //Find the TextView in list_Item.xml for Location Name
        TextView LocationName = (TextView) listItemView.findViewById(R.id.location_name);
        LocationName.setText(currentWord.getmLocationName());

        //Find the TextView in list_Item.xml for Location Phone Number
        TextView LocationPhone = (TextView) listItemView.findViewById(R.id.phone_number);
        LocationPhone.setText(currentWord.getmLocationPhone());

        //Find the TextView in list_Item.xml for Location Address
        TextView LocationAddress = (TextView) listItemView.findViewById(R.id.address_to_location);
        LocationAddress.setText(currentWord.getmLocationAddress());

        //Find the TextView in list_Item.xml for Location Name
        ImageView LocationImage = (ImageView) listItemView.findViewById(R.id.image);

            if (currentWord.hasImage()){
                // If an image is available, display the provided image based on the resource ID
                LocationImage.setImageResource(currentWord.getmImageResourceId());
                // Make image visible
                LocationImage.setVisibility(View.VISIBLE);
             }
             else {
                // Otherwise change visibility to GONE
                LocationImage.setVisibility(View.GONE);
            }

        View textContainer = listItemView.findViewById(R.id.text_container);
            int color = ContextCompat.getColor(getContext(),mColorResouceId);
            textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

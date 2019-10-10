package com.egsbusinesssolutions.virginiatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jose F. Gomez on 8/28/2018.
 */
public class FoodFragment extends Fragment {
    public FoodFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rooView = inflater.inflate(R.layout.custom_word_list,container,false);

        //Here Starts the Array
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.restaurant_1),getString(R.string.restaurant_ph_1),getString(R.string.restaurant_address_1),R.drawable.restaurant_el_paisa));
        words.add(new Word(getString(R.string.restaurant_2),getString(R.string.restaurant_ph_2),getString(R.string.restaurant_address_2),R.drawable.restaurant_bilus));
        words.add(new Word(getString(R.string.restaurant_3),getString(R.string.restaurant_ph_3),getString(R.string.restaurant_address_3),R.drawable.restaurant_greene_turtle));
        words.add(new Word(getString(R.string.restaurant_4),getString(R.string.restaurant_ph_4),getString(R.string.restaurant_address_4),R.drawable.restaurant_first_watch));
        words.add(new Word(getString(R.string.restaurant_5),getString(R.string.restaurant_ph_5),getString(R.string.restaurant_address_5),R.drawable.restaurant_food_craft));


        WordAdapter adapter = new WordAdapter(getActivity(),words,R.color.category_restaurants);

        ListView listView = (ListView) rooView.findViewById(R.id.list);
                listView.setAdapter(adapter);

        return rooView;
    }
}

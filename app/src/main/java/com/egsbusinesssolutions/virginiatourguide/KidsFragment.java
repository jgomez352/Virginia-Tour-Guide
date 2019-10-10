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
public class KidsFragment extends Fragment {
    public KidsFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rooView = inflater.inflate(R.layout.custom_word_list,container,false);

        //Here Starts the Array
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.kid_1),getString(R.string.kid_ph_1),getString(R.string.kid_address_1)));
        words.add(new Word(getString(R.string.kid_2),getString(R.string.kid_ph_2),getString(R.string.kid_address_2)));
        words.add(new Word(getString(R.string.kid_3),getString(R.string.kid_ph_3),getString(R.string.kid_address_3)));
        words.add(new Word(getString(R.string.kid_4),getString(R.string.kid_ph_4),getString(R.string.kid_address_4)));
        words.add(new Word(getString(R.string.kid_5),getString(R.string.kid_ph_5),getString(R.string.kid_address_5)));


        WordAdapter adapter = new WordAdapter(getActivity(),words,R.color.category_family_friendly);

        ListView listView = (ListView) rooView.findViewById(R.id.list);
                listView.setAdapter(adapter);

        return rooView;
    }
}

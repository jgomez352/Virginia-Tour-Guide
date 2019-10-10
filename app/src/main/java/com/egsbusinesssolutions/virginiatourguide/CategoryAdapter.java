package com.egsbusinesssolutions.virginiatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jose F. Gomez on 8/28/2018.
 */
public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new FoodFragment();
        }
        else if (position == 1) {
            return new LandMarkFragment();
        }
        else if (position == 2) {
            return new ThemeParkFragment();
        }
        else {
            return new KidsFragment();
        }

    }


    @Override
    public int getCount() {
        return 4;
    }



    @Override
    public CharSequence getPageTitle(int position) {




        if (position == 0) {
            return mContext.getResources().getString(R.string.food);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.land_marks);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.theme_parks);
        } else {
            return mContext.getResources().getString(R.string.kids);
        }
    }
}

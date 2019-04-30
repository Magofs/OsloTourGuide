package com.example.android.oslotourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class OsloFragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * Create a new {@link OsloFragmentAdapter} object.
     *
     * @param cx is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public OsloFragmentAdapter(Context cx, FragmentManager fm) {
        super( fm );
        mContext = cx;
    }

    /*Creating new fragments*/
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new BuildingFragment();
            case 1:
                return new SportFragment();
            case 2:
                return new MuseumFragment();
            case 3:
                return new PeopleFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    /*Creating tab headlines*/
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString( R.string.oslo_buildings );
            case 1:
                return mContext.getString( R.string.oslo_sports );
            case 2:
                return mContext.getString( R.string.oslo_museums );
            case 3:
                return mContext.getString( R.string.oslo_people );
        }
        return super.getPageTitle( position );
    }
}

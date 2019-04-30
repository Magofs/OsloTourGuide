package com.example.android.oslotourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        //the content of the activity uses the activity_main.xml layout file
        setContentView( R.layout.activity_main );

        // Initializes view pager allowing users to swipe between fragments
        ViewPager pager = findViewById( R.id.viewpager );

        // Create an adapter that knows which fragment should be shown on each page
        OsloFragmentAdapter adapter = new OsloFragmentAdapter( this, getSupportFragmentManager() );

        // Set the adapter onto the view pager
        pager.setAdapter( adapter );

        //Initialize the tab layout showing the tabs
        TabLayout tab = findViewById( R.id.tabs );

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tab.setupWithViewPager( pager );


    }
}

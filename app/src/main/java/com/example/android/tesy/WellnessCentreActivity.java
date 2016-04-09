package com.example.android.tesy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Adapter;

/**
 * Created by shubhamgupta on 4/6/16.
 */

public class WellnessCentreActivity extends FragmentActivity {

    WellnessCentreAdapter mWellnessCentreAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        //getWindow().setEnterTransition(new Fade(Fade.IN));
        //getWindow().setReturnTransition(new Fade(Fade.OUT));
        setContentView(R.layout.activity_wellness_centres);


        mWellnessCentreAdapter = new WellnessCentreAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.wellnesscentrepager);
        mViewPager.setAdapter(mWellnessCentreAdapter);



    }

    private class WellnessCentreAdapter extends FragmentPagerAdapter
    {
        public WellnessCentreAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return WellnessCentre.newInstance();
                default: return WellnessCentre.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "Wellness Centre";
                default: return "Wellness Centre";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }
    }
}


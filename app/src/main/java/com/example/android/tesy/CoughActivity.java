package com.example.android.tesy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.transition.Fade;
import android.view.Window;
import android.widget.Adapter;


/**
 * Created by shubhamgupta on 4/5/16.
 */

public class CoughActivity extends FragmentActivity {

    CoughAdapter mCoughAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cough);


        mCoughAdapter = new CoughAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.coughpager);
        mViewPager.setAdapter(mCoughAdapter);



    }

    private class CoughAdapter extends FragmentPagerAdapter
    {
        public CoughAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return Cough1.newInstance();
                case 1 : return Cough2.newInstance();
                case 2 : return Cough3.newInstance();
                default: return Cough1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "Cough";
                case 1 : return "Cough";
                case 2 : return "Cough";
                default: return "Cough";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }



    }
}


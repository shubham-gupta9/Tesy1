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

public class EyeSightActivity extends FragmentActivity {

    EyeSightAdapter mEyeSightAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_eyesight);


        mEyeSightAdapter = new EyeSightAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.eyesightpager);
        mViewPager.setAdapter(mEyeSightAdapter);



    }

    private class EyeSightAdapter extends FragmentPagerAdapter
    {
        public EyeSightAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return EyeSight1.newInstance();
                case 1 : return EyeSight2.newInstance();
                case 2 : return EyeSight3.newInstance();
                default: return EyeSight1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "EyeSight";
                case 1 : return "EyeSight";
                case 2 : return "EyeSight";
                default: return "EyeSight";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }



    }
}


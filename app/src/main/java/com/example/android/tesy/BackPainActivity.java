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

public class BackPainActivity extends FragmentActivity {

    BackPainAdapter mBackPainAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_backpain);


        mBackPainAdapter = new BackPainAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.backpainpager);
        mViewPager.setAdapter(mBackPainAdapter);



    }

    private class BackPainAdapter extends FragmentPagerAdapter
    {
        public BackPainAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return BackPain1.newInstance();
                case 1 : return BackPain2.newInstance();
                case 2 : return BackPain3.newInstance();
                default: return BackPain1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "BackPain";
                case 1 : return "BackPain";
                case 2 : return "BackPain";
                default: return "BackPain";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }



    }
}


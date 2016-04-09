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

public class FluActivity extends FragmentActivity {

    FluAdapter mFluAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_flu);


        mFluAdapter = new FluAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.flupager);
        mViewPager.setAdapter(mFluAdapter);



    }

    private class FluAdapter extends FragmentPagerAdapter
    {
        public FluAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return Flu1.newInstance();
                case 1 : return Flu2.newInstance();
                case 2 : return Flu3.newInstance();
                default: return Flu1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "Flu";
                case 1 : return "Flu";
                case 2 : return "Flu";
                default: return "Flu";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }



    }
}


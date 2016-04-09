package com.example.android.tesy;

/**
 * Created by shubhamgupta on 4/6/16.
 */
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

public class StomachActivity extends FragmentActivity {

    StomachAdapter mStomachAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        //getWindow().setEnterTransition(new Fade(Fade.IN));
        //getWindow().setReturnTransition(new Fade(Fade.OUT));
        setContentView(R.layout.activity_stomach);


        mStomachAdapter = new StomachAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.stomachpager);
        mViewPager.setAdapter(mStomachAdapter);



    }

    private class StomachAdapter extends FragmentPagerAdapter
    {
        public StomachAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return Stomach1.newInstance();
                case 1 : return Stomach2.newInstance();
                case 2 : return Stomach3.newInstance();
                default: return Stomach1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "Stomach";
                case 1 : return "Stomach";
                case 2 : return "Stomach";
                default: return "Stomach";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }
    }
}



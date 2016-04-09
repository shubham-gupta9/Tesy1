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

/**
 * Created by shubhamgupta on 4/5/16.
 */

public class LunchPlanActivity extends FragmentActivity {

    LunchPlanAdapter mLunchPlanAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        //getWindow().setEnterTransition(new Fade(Fade.IN));
        //getWindow().setReturnTransition(new Fade(Fade.OUT));
        setContentView(R.layout.activity_lunch_plan);


        mLunchPlanAdapter = new LunchPlanAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.lunchplanpager);
        mViewPager.setAdapter(mLunchPlanAdapter);



    }

    private class LunchPlanAdapter extends FragmentPagerAdapter
    {
        public LunchPlanAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return Lunch1.newInstance();
                case 1 : return Lunch2.newInstance();
                case 2 : return Lunch3.newInstance();
                default: return Lunch1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "Lunch";
                case 1 : return "Lunch";
                case 2 : return "Lunch";
                default: return "Lunch";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }
    }
}


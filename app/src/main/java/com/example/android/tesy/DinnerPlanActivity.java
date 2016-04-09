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
import android.widget.TextView;

/**
 * Created by shubhamgupta on 4/5/16.
 */

public class DinnerPlanActivity extends FragmentActivity {

    DinnerPlanAdapter mDinnerPlanAdapter;
    ViewPager mViewPager;
    TextView[] dots;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        //getWindow().setEnterTransition(new Fade(Fade.IN));
        //getWindow().setReturnTransition(new Fade(Fade.OUT));
        setContentView(R.layout.activity_dinner_plan);


        mDinnerPlanAdapter = new DinnerPlanAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.dinnerplanpager);
        mViewPager.setAdapter(mDinnerPlanAdapter);



    }

    private class DinnerPlanAdapter extends FragmentPagerAdapter
    {
        public DinnerPlanAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return Dinner1.newInstance();
                case 1 : return Dinner2.newInstance();
                case 2 : return Dinner3.newInstance();
                default: return Dinner1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "Dinner";
                case 1 : return "Dinner";
                case 2 : return "Dinner";
                default: return "Dinner";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }
    }
}



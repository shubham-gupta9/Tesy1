package com.example.android.tesy;

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

public class ExercisePlanActivity extends FragmentActivity {

    ExcercisePlanAdapter mExcercisePlanAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        //getWindow().setEnterTransition(new Fade(Fade.IN));
        //getWindow().setReturnTransition(new Fade(Fade.OUT));
        setContentView(R.layout.activity_exercise_plan);


        mExcercisePlanAdapter = new ExcercisePlanAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.exerciseplanpager);
        mViewPager.setAdapter(mExcercisePlanAdapter);



    }

    private class ExcercisePlanAdapter extends FragmentPagerAdapter
    {
        public ExcercisePlanAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return Exercise1.newInstance();
                case 1 : return Exercise2.newInstance();
                case 2 : return Exercise3.newInstance();
                case 3 : return Exercise4.newInstance();
                case 4 : return Exercise5.newInstance();
                default: return Exercise1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "Jumping Jack";
                case 1 : return "Core Rotation";
                case 2 : return "Burpee Push Up";
                case 3 : return "Side Bridge Reach";
                case 4 : return "Speed Skater";
                default: return "Jumping Jack";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }
    }
}


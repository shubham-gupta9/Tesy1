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

public class BreakfastPlanActivity extends FragmentActivity {

    BreakfastPlanAdapter mBreakfastPlanAdapter;
    ViewPager mViewPager;
    private static final int NUM_PAGES = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_breakfast_plan);


        mBreakfastPlanAdapter = new BreakfastPlanAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.breakfastplanpager);
        mViewPager.setAdapter(mBreakfastPlanAdapter);



    }

    private class BreakfastPlanAdapter extends FragmentPagerAdapter
    {
        public BreakfastPlanAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position)
        {
            switch(position)
            {
                case 0 : return Breakfast1.newInstance();
                case 1 : return Breakfast2.newInstance();
                case 2 : return Breakfast3.newInstance();
                default: return Breakfast1.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0 : return "Breakfast";
                case 1 : return "Breakfast";
                case 2 : return "Breakfast";
                default: return "Breakfast";
            }
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES;
        }



    }
}


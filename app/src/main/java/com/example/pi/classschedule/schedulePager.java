package com.example.pi.classschedule;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by pi on 10/27/17.
 */

public class schedulePager extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments=new ArrayList<Fragment>();

    public schedulePager(FragmentManager fm)
    {
        super(fm);
***REMOVED***

    @Override
    public Fragment getItem(int position)
    {

        return fragments.get(position);
***REMOVED***

    @Override
    public int getCount() {
        return fragments.size();
***REMOVED***
    //ADD PAGE
    public void addFragment(Fragment f)
    {
        fragments.add(f);
***REMOVED***


    @Override
    public CharSequence getPageTitle(int position) {
        switch(position)
        {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return  "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";

            default:
                return "Ollo";
***REMOVED***
***REMOVED***
***REMOVED***

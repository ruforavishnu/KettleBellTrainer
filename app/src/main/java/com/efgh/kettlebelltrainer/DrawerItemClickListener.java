package com.efgh.kettlebelltrainer;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Vishnu on 0007,07-Sep-16.
 */
public class DrawerItemClickListener implements ListView.OnItemClickListener
{

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {

        //selectItem(position);
    }

}

/*
    private void selectItem(int position)
    {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new CreateFragment();
                break;
           *//**//* case 1:
                fragment = new ReadFragment();
                break;
            case 2:
                fragment = new HelpFragment();
                break;*//**//*

            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            getActionBar().setTitle(mNavigationDrawerItemTitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);

        } else {
            Log.e("MainActivity", "Error in creating fragment");
        }
    }*/

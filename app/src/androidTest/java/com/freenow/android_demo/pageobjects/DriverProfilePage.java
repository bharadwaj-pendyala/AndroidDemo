package com.freenow.android_demo.pageobjects;

import android.support.test.espresso.ViewInteraction;

import com.freenow.android_demo.R;

public class DriverProfilePage extends Utils{

    /*
    Elements
     */

    public ViewInteraction callBtn(){
        return findElementById(R.id.fab);
    }

    /*
    Test
     */

    public void callDriver(){
        clickView(callBtn());
    }

}

package com.freenow.android_demo.pageobjects;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.freenow.android_demo.R;
import com.freenow.android_demo.utils.Utils;

public class DriverProfilePage extends Utils {


    public DriverProfilePage(ActivityTestRule activityRule) {
        super(activityRule);
    }

    /*
    Elements
     */

    public ViewInteraction callBtn() {
        return findElementById(R.id.fab);
    }

    /*
    Test
     */

    public DriverProfilePage callDriver() {
        clickView(callBtn());
        return this;
    }

}

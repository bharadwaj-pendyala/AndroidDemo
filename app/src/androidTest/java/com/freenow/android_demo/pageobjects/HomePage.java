package com.freenow.android_demo.pageobjects;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.freenow.android_demo.R;
import com.freenow.android_demo.activities.AuthenticationActivity;
import com.freenow.android_demo.activities.MainActivity;
import com.freenow.android_demo.utils.Utils;

import org.junit.Before;
import org.junit.Rule;

public class HomePage extends Utils {

    public HomePage(ActivityTestRule activityRule) {
        super(activityRule);
    }

    /*
    Page Elements
     */

    public ViewInteraction searchBox() {
        return findElementById(R.id.textSearch);
    }

    public ViewInteraction searchResultsDriverSelection(String driverName) {
        return findElementByText(driverName);
    }

    /*
    Tests
     */
    public DriverProfilePage driverSearch(String searchString, String driverName) throws InterruptedException {
        Thread.sleep(5000);
        enterTextInputCloseKeyboard(searchBox(), searchString);
        selectRootMatchersPlatformPopUp(searchResultsDriverSelection(driverName));
        return new DriverProfilePage(this.getActivityRule());
    }

}

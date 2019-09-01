package com.freenow.android_demo.pageobjects;

import android.support.test.espresso.ViewInteraction;

import com.freenow.android_demo.R;

public class HomePage extends Utils{

    /*
    Page Elements
     */

    public ViewInteraction searchBox(){
        return findElementById(R.id.textSearch);
    }

    public ViewInteraction searchResultsDriverSelection(String driverName){
        return findElementByText(driverName);
    }

    /*
    Tests
     */
    public void driverSearch(String searchString, String driverName){
        enterTextInputCloseKeyboard(searchBox(), searchString);
        selectRootMatchersPlatformPopUp(searchResultsDriverSelection(driverName));
    }

}

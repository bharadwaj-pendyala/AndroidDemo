package com.freenow.android_demo;


import android.content.Intent;
import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.freenow.android_demo.R;
import com.freenow.android_demo.activities.DriverProfileActivity;
import com.freenow.android_demo.activities.MainActivity;
import com.freenow.android_demo.adapters.DriverAdapter;
import com.freenow.android_demo.models.Driver;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static com.freenow.android_demo.misc.Constants.LOG_TAG;
import static org.hamcrest.Matchers.*;
import static android.support.test.espresso.matcher.RootMatchers.*;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class FormattedTestCode {


    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mActivity = null;


    @Rule
    public GrantPermissionRule mGrantPermissionRule =
            GrantPermissionRule.grant(
                    "android.permission.ACCESS_FINE_LOCATION");


    @Before
    public void setActivity() {
        mActivity = mActivityTestRule.getActivity();
    }


    @Test
    public void loginToApp() {
        MainActivity activityUnderTest = mActivityTestRule.getActivity();
        activityUnderTest.sendBroadcast(new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS));
        onView(withId(R.id.edt_username)).perform(click(), replaceText("crazydog335"), closeSoftKeyboard());
        onView(withId(R.id.edt_password)).perform(click(), replaceText("venture"), closeSoftKeyboard());
        onView(withId(R.id.btn_login))
                .perform(click());
    }

    @Test
    public void searchText() throws InterruptedException{
        Thread.sleep(5000);
        onView(withId(R.id.textSearch)).perform(click(), replaceText("sa"), closeSoftKeyboard());

        onView(withText("Sarah Scott"))
                .inRoot(withDecorView(not(is(mActivity.getWindow().getDecorView()))))
                .perform(click());

        onView(withId(R.id.fab))
                .perform(click());

    }

}

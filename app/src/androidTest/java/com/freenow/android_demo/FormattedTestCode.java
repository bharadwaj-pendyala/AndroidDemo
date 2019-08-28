package com.freenow.android_demo;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;
import android.support.test.runner.AndroidJUnit4;

import com.freenow.android_demo.activities.AuthenticationActivity;
import com.freenow.android_demo.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class FormattedTestCode {

    @Rule
    public GrantPermissionRule mGrantPermissionRule =
            GrantPermissionRule.grant(
                    "android.permission.ACCESS_FINE_LOCATION");

    @Rule
    public ActivityTestRule<AuthenticationActivity> activityRule =
            new ActivityTestRule<>(AuthenticationActivity.class);

    @Test
    public void setAppContext() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.freenow.android_demo", appContext.getPackageName());
    }

    @Test
    public void loginToApp() {
        onView(withId(R.id.edt_username)).perform(click(), replaceText("crazydog335"), closeSoftKeyboard());
        onView(withId(R.id.edt_password)).perform(click(), replaceText("venture"), closeSoftKeyboard());
        onView(withId(R.id.btn_login))
                .perform(click());
    }

//    @Test
//    public void searchText() throws InterruptedException{
//        Thread.sleep(5000);
//        onView(withId(R.id.textSearch)).perform(click(), replaceText("sa"), closeSoftKeyboard());
//
//        onView(withText("Sarah Scott")).inRoot(RootMatchers.isPlatformPopup()).perform(click());
//
//        onView(withId(R.id.fab))
//                .perform(click());
//
//    }

}

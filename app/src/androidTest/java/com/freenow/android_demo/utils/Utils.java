package com.freenow.android_demo.utils;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

import com.freenow.android_demo.activities.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Utils {

    private final ActivityTestRule activityRule;

    protected ActivityTestRule getActivityRule() {
        return activityRule;
    }

    public Utils(ActivityTestRule<MainActivity> activityRule) {
        this.activityRule = activityRule;
    }

    /*
     Finding ViewMatchers
     */

    public ViewInteraction findElementById(int id) {
        return onView(withId(id));
    }

    public ViewInteraction findElementByText(String text) {
        return onView(withText(text));
    }

    /*
    Performing ViewActions
    */

    public void enterTextInput(ViewInteraction mViewInteraction, String textToBeTyped) {
        mViewInteraction.perform(ViewActions.typeText(textToBeTyped));
    }

    public void clearTextInFld(ViewInteraction mViewInteraction) {
        mViewInteraction.perform(ViewActions.clearText());
    }

    public void enterTextInputCloseKeyboard(ViewInteraction mViewInteraction, String text) {
        mViewInteraction.perform(ViewActions.click(), ViewActions.replaceText(text)).perform(ViewActions.closeSoftKeyboard());
    }

    public void clickView(ViewInteraction mViewInteraction) {
        mViewInteraction.perform(ViewActions.click());
    }

    public void selectRootMatchersPlatformPopUp(ViewInteraction mViewInteraction) {
        mViewInteraction.inRoot(RootMatchers.isPlatformPopup()).perform(click());
    }

    /*
    Performing Assertions
    */

    public void matchText(ViewInteraction mViewInteraction, String textToBeMatched) {
        mViewInteraction.check(ViewAssertions.matches(ViewMatchers.withText(textToBeMatched)));
    }

    /*
    Navigate utils
     */
    public void navigateBack() {
        onView(isRoot()).perform(ViewActions.pressBack());
    }

}

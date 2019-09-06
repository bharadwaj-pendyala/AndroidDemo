package com.freenow.android_demo.tests;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;

import com.freenow.android_demo.activities.MainActivity;
import com.freenow.android_demo.pageobjects.DriverProfilePage;
import com.freenow.android_demo.pageobjects.HomePage;
import com.freenow.android_demo.pageobjects.LoginPage;
import com.freenow.android_demo.utils.Constants;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InstrumentedTests {

    protected final Context appContext = InstrumentationRegistry.getTargetContext();

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);

    @Test
    public void TC_01_loginValidationTest() {
        LoginPage lp = new LoginPage(activityRule);
        lp.loginToFreeNow(Constants.getUserName(), Constants.getPassword());
    }

    @Test
    public void TC_02_searchReqDriverTestAndCall() throws InterruptedException {
        HomePage hp = new HomePage(activityRule);
        hp.driverSearch(Constants.getSearchString(), Constants.getReqDriverName());
        DriverProfilePage dp = new DriverProfilePage(activityRule);
        dp.callDriver();
    }
    
}

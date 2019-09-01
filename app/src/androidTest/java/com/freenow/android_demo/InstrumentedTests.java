package com.freenow.android_demo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;

import com.freenow.android_demo.activities.MainActivity;
import com.freenow.android_demo.pageobjects.DriverProfilePage;
import com.freenow.android_demo.pageobjects.HomePage;
import com.freenow.android_demo.pageobjects.LoginPage;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InstrumentedTests {

    protected final Context appContext = InstrumentationRegistry.getTargetContext();

    @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    LoginPage lp = new LoginPage();
    HomePage hp = new HomePage();
    DriverProfilePage dp = new DriverProfilePage();

    @Test
    public void TC_01_loginValidationTest(){
        lp.loginToFreeNow("crazydog335", "venture");
    }

    @Test
    public void TC_02_searchReqDriverTestAndCall() throws InterruptedException {
        hp.driverSearch("sa", "Sarah Scott");
        dp.callDriver();
    }

}

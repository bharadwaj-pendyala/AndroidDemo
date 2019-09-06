package com.freenow.android_demo.pageobjects;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.freenow.android_demo.R;
import com.freenow.android_demo.utils.Utils;

public class LoginPage extends Utils {

    public LoginPage(ActivityTestRule activityRule) {
        super(activityRule);
    }

    /*
    Page Elements
     */

    public ViewInteraction userNameFld() {
        return findElementById(R.id.edt_username);
    }

    public ViewInteraction pwdFld() {
        return findElementById(R.id.edt_password);
    }

    public ViewInteraction loginBtn() {
        return findElementById(R.id.btn_login);
    }


    /*
    Tests
     */
    public HomePage loginToFreeNow(String userName, String pwd) {
        enterTextInputCloseKeyboard(userNameFld(), userName);
        enterTextInputCloseKeyboard(pwdFld(), pwd);
        clickView(loginBtn());
        return new HomePage(this.getActivityRule());
    }

}

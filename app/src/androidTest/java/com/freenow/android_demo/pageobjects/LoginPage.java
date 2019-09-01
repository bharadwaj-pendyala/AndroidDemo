package com.freenow.android_demo.pageobjects;

import android.support.test.espresso.ViewInteraction;

import com.freenow.android_demo.R;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class LoginPage extends Utils {

    /*
    Page Elements
     */

    public ViewInteraction userNameFld(){
        return findElementById(R.id.edt_username);
    }

    public ViewInteraction pwdFld(){
        return findElementById(R.id.edt_password);
    }

    public ViewInteraction loginBtn(){
        return findElementById(R.id.btn_login);
    }


    /*
    Tests
     */
    public void loginToFreeNow(String userName, String pwd){
        enterTextInputCloseKeyboard(userNameFld(), userName);
        enterTextInputCloseKeyboard(pwdFld(), pwd);
        clickView(loginBtn());
    }

}

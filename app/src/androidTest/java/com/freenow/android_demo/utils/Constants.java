package com.freenow.android_demo.utils;

public class Constants {

    private static String userName = "crazydog335";
    private static String password = "venture";
    private static String searchString = "sa";
    private static String reqDriverName = "Sarah Scott";

    public static String getSearchString() {
        return searchString;
    }

    public static void setSearchString(String searchString) {
        Constants.searchString = searchString;
    }

    public static String getReqDriverName() {
        return reqDriverName;
    }

    public static void setReqDriverName(String reqDriverName) {
        Constants.reqDriverName = reqDriverName;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Constants.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Constants.password = password;
    }
}

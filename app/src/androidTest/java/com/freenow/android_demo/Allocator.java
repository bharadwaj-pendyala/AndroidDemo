package com.freenow.android_demo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.GrantPermissionRule;

import org.junit.Rule;

public class Allocator {

    protected final Context appContext = InstrumentationRegistry.getTargetContext();

    @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);


}

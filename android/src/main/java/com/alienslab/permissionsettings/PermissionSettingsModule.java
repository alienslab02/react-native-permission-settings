package com.alienslab.permissionsettings;

import android.support.v4.app.NotificationManagerCompat;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

/**
 * Created by applepc on 26/09/2017.
 */

public class PermissionSettingsModule extends ReactContextBaseJavaModule {

    public PermissionSettingsModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return getCurrentActivity().getString(R.string.app_name);
    }

    public boolean areNotificationsEnabled() {
        return NotificationManagerCompat.from(getCurrentActivity()).areNotificationsEnabled();
    }
}

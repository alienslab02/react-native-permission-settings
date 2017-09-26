package com.alienslab.permissionsettings;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by applepc on 26/09/2017.
 */

public class PermissionSettingsModule extends ReactContextBaseJavaModule {

    public PermissionSettingsModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "PermissionSettings";
    }

    @ReactMethod
    public void areNotificationsEnabled(Callback cb) {
        boolean isEnabled = new NotificationsUtils().isNotificationEnabled(getCurrentActivity());
        cb.invoke(isEnabled);
    }

}

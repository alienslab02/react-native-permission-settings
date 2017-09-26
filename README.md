# react-native-permission-settings

Get to know if user has turned off notifications of your app from app settings. Only for Android.

# Installation

Run this command in terminal inside your projects root folder.

`npm install react-native-permission-settings`


<b>Android</b>

Step 1:

In android/settings.gradle file add following lines
```
include ':react-native-permission-settings'
project(':react-native-permission-settings').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-permission-settings/android')
```

Step 2:
In your android/app/build.gradle file add following line in dependencies.
```
dependencies: {
	...
	compile project(':react-native-permission-settings')
}
```

Step 3:

In your MainApplication.java located in android/app/src/main/java/com/<your_app>/ folder, add following lines in

```
import com.alienslab.permissionsettings.PermissionSettingsPackage; // <---

...

protected List<ReactPackage> getPackages() {
  return Arrays.asList(
      new MainReactPackage(),
      new PermissionSettingsPackage(), // <---
  );
}
```

# Usage

```
import NotificationSettings from 'react-native-permission-settings';

...

NotificationSettings.areNotificationsEnabled((isEnabled: boolean) => {
  console.log(`Notifications are enabled: ${isEnabled}`);
});
```


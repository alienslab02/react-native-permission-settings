# react-native-linktextview

Ever needed to add url/links inside text in react-native? Here is one convinient way to do so, Use this android-only react-native component to add Clickable URLs inside a regular Text with support of Accessibilty.

# Installation

Run this command in terminal inside your projects root folder.

`npm install react-native-linktextview`


<b>Android</b>

Step 1:

In android/settings.gradle file add following lines
```
include ':react-native-linktextview'
project(':react-native-linktextview').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-linktextview/android')
```

Step 2:
In your android/app/build.gradle file add following line in dependencies.
```
dependencies: {
	...
	compile project(':react-native-linktextview')
}
```

Step 3:

In your MainApplication.java located in android/app/src/main/java/com/<your_app>/ folder, add following lines in

```
import com.alienslab.linktextview.ReactLinkTextViewPackage; // <---

...

protected List<ReactPackage> getPackages() {
  return Arrays.asList(
      new MainReactPackage(),
      new ReactLinkTextViewPackage(), // <---
  );
}
```

# Usage

```
import LinkText from 'react-native-linktextview';

...

<LinkText style={styles.description}>
  <LinkText text={'Do you want to search it on google? '} />
  <LinkText
    style={styles.link}
    url={'https://google.com'}
    text={'Click Here'}
  />
</LinkText>
```

#### Result
Do you want to search it on Google? [Click here](https://www.google.com/).

`LinkText` supprts all properties of React-Native `Text` component.


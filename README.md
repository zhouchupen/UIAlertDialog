# UIAlertDialog

Android仿iOS警示对话框

![](http://upload-images.jianshu.io/upload_images/2746415-7aec7081b266f2dd.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## Installing

Users of your library will need add the jitpack.io repository:

```gradle
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

and:

```gradle
dependencies {
    compile 'com.github.zhouchupen:UIAlertDialog:v1.0'
}
```

Note: do not add the jitpack.io repository under `buildscript` 

## Adding a sample app 

If you add a sample app to the same repo then your app needs to depend on the library. To do this in your app/build.gradle add a dependency in the form:

```gradle
dependencies {
    compile project(':library')
}
```

where 'library' is the name of your library module.

## Using

You may need this to use the alert dialog. If you want to show a dialog with two buttons:
```java
public void showTwoButtonDialog(){

    final UIAlertDialog dialog = new UIAlertDialog(this);
    dialog.setTitle("友情提示");
    dialog.setMessage("请先完善您的信息\n再进行相关操作");
    dialog.setNegativeButton("知道了", UIAlertDialog.BUTTON_LEFT, new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialog.dismiss();
        }
    });
    dialog.setPositiveButton("现在就去", UIAlertDialog.BUTTON_RIGHT, new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialog.dismiss();
        }
    });
    //dialog.show();
}
```
And if you just want to show with only one button:
```java
public void showOneButtonDialog(){

    final UIAlertDialog dialog = new UIAlertDialog(this);
    dialog.setTitle("友情提示");
    dialog.setMessage("请先完善您的信息\n再进行相关操作");
    dialog.setButton("知道了", new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dialog.dismiss();
        }
    });
    //dialog.show();
}
```

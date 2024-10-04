package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumRun {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        String androidAppUrl;
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator + "resources" + File.separator + "apps" + File.separator + "app-release-10.apk";
        caps.setCapability("app", androidAppUrl);
        URL url=new URL("http://127.0.0.1:4723");
        AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(url,caps);
    }
}

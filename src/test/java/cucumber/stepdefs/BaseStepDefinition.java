package cucumber.stepdefs;

import com.mobile.appium.AppiumDriverFactory;
import com.mobile.appium.AppiumManager;
import com.mobile.os.android.ADB;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
 * Created by pritamkadam on 17/09/16.
 */
public class BaseStepDefinition {

    public AppiumDriver<MobileElement> driver;
    private static AppiumManager appiumManager = new AppiumManager();
//    ADB adb = new ADB();



    public AppiumDriver<MobileElement> getAppiumDriver(){
        return getAppiumDriver();
    }



}

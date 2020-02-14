package BaseClasses;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Capabilities {
    static IOSDriver <IOSElement> driver;
    public static IOSDriver<IOSElement> Capabilities()throws MalformedURLException {
        File app = new File(System.getProperty("user.dir") + "/app/UICatalog.app");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities ();
        desiredCapabilities.setCapability ("app", app.getAbsolutePath ());
        desiredCapabilities.setCapability ("platformName", "iOS");
        desiredCapabilities.setCapability ("platformVersion", "13.3");
        desiredCapabilities.setCapability ("deviceName", "iPhone 8");
        desiredCapabilities.setCapability ("udid", "DB7B0058-5660-4F49-A1BB-321C36376334");
        desiredCapabilities.setCapability( MobileCapabilityType.TAKES_SCREENSHOT, "true");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        URL remoteUrl = new URL ("http://localhost:4723/wd/hub");
        driver = new IOSDriver (remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
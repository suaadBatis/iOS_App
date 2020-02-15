package BaseClasses;

import io.appium.java_client.MobileElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Utils;
import java.net.MalformedURLException;


import static io.appium.java_client.remote.IOSMobileCapabilityType.BUNDLE_ID;




public class DropDwon extends Capabilities {
    @Test
    public void DropDwon () throws MalformedURLException {
        IOSDriver<IOSElement> driver = Capabilities();
        MobileElement el1 = driver.findElementByAccessibilityId("Picker View");
        el1.click();
        MobileElement el2 = driver.findElementByXPath("//XCUIElementTypePickerWheel[@name=\"Green color component value\"]");
        el2.sendKeys("220");
        driver.findElementByAccessibilityId("Red color component value").sendKeys("45"); Utils.sleep ( 8 );

    }
    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

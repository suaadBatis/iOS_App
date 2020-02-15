package BaseClasses;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Utils;

import java.net.MalformedURLException;
import java.time.Duration;

public class IncAndDeElements extends Capabilities {



    @Test
    public void IncAndDeElements () throws MalformedURLException {
        IOSDriver<IOSElement> driver = Capabilities();
        //Scrolling
        new TouchAction (driver).press( PointOption.point(0, 548)).waitAction( WaitOptions.waitOptions( Duration.ofMillis(1000))).
        moveTo(PointOption.point(320, 44 )).release().perform();Utils.sleep(3);
        driver.findElementByAccessibilityId("Steppers").click ();
        //Clicks on the specific button with the same name class ..
        MobileElement el1 = driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Increment\"])[1]");
         el1.click();
         el1.click();
         // To read texts
        System.out.println ( driver.findElementsByClassName ("XCUIElementTypeStaticText").get(0).getText () );
        System.out.println ( driver.findElementsByClassName ("XCUIElementTypeStaticText").get(1).getText () );

    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

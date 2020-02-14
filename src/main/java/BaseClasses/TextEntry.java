package BaseClasses;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utils.Utils;
import java.net.MalformedURLException;

public class TextEntry extends Capabilities {
    @Test
    public void start () throws MalformedURLException{
        IOSDriver<IOSElement> driver = Capabilities();
        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath ("//*[@value='Text Entry']").click ();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys ( "hello  it's me" );
        driver.findElementByName("OK").click();Utils.sleep(6);
        driver.navigate().back();
    }
    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

package BaseClasses;

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

public class ScrolDwon extends Capabilities{
    @Test
    public void ScrolDwon () throws MalformedURLException {
        IOSDriver<IOSElement> driver = Capabilities();
        new TouchAction (driver).press( PointOption.point(10, 500)).waitAction( WaitOptions.waitOptions( Duration.ofMillis(1000))).
                moveTo(PointOption.point(100, 80)).release().perform();Utils.sleep ( 3 );
    }
    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

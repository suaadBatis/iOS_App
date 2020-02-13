
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class base{
    public static IOSDriver<IOSElement>  base( ) throws MalformedURLException {
        File app = new File(System.getProperty("user.dir") + "/app/IntegrationApp.app");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities ();
        desiredCapabilities.setCapability ("platformName", "iOS");
        desiredCapabilities.setCapability ("platformVersion", "13.3");
        desiredCapabilities.setCapability ("deviceName", "iPhone11Pro");
        desiredCapabilities.setCapability ("udid", "5AE0ECF3-754B-4520-9062-7FCC837F6C84");
        desiredCapabilities.setCapability ("app", app.getAbsolutePath ());
        //desiredCapabilities.setCapability( MobileCapabilityType.TAKES_SCREENSHOT, "true");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        URL remoteUrl = new URL ("http://localhost:4723/wd/hub");
        IOSDriver <IOSElement> driver = new IOSDriver (remoteUrl, desiredCapabilities);
        return driver;

    }
}
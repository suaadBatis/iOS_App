import com.sun.javafx.iio.ios.IosDescriptor;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class test  extends base{
    @Test
    public void start () throws MalformedURLException {
        IOSDriver<IOSElement> driver = base();
        driver.hideKeyboard (  );
    }
}

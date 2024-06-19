package royalBrothers;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.URL;

// creating class with name RentalRide
public class RentalRide{
	//creating method with name capabilities
public AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
	
	//setting up the required capabilities to connect emulator with ide 
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Deepak");
	
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.royalbrothers.MainActivity");
	
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.royalbrothers");
	
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
	
	cap.setCapability(MobileCapabilityType.NO_RESET, true);
	
	//connecting appium with emulator and ide
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	
	return driver;
}
}

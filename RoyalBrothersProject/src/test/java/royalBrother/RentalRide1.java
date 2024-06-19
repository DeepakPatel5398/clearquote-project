package royalBrother;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
// import io.appium.java_client.android.nativekey.KeyEvent;
import royalBrothers.RentalRide;

//creating class which extends src/main/java desired capabilities
public class RentalRide1 extends RentalRide {
    
	// defining driver globally
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest           // defining test-ng annotation & creating method with name setup
	public void setup() throws Exception {
		
	    // setting up driver name and address and capabilities
		driver = capabilities();
		
		//applying implicit wait so that every element should get display 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test(enabled = true)    //// defining test-ng annotation & creating method with name demotest1
	public void demotest1() throws InterruptedException {
			
		//clicking on skip button
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"SKIP\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//choosing Bangalore location
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"BANGALORE\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//scrolling till and clicking on Royal Enfield Meteor Supernova 650 bike
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable().scrollable(true).instence(0)"+".scrollIntoView(new UiSelector()"+".textMatches(\"" +"Royal Enfield Meteor Supernova 350" + "\").instance(0))")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Royal Enfield Meteor Supernova 350\"))").click();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//selecting by clicking on 7 days
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"7 DAYS\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on book now button
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"BOOK NOW\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on date to select date and time
        driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// clicking on "<" button to go to desired date to select 4 oct 2024
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		// clicking on "<" button to go to desired date to select 4 oct 2024
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		// clicking on "<" button to go to desired date to select 4 oct 2024
	    driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		// clicking on "<" button to go to desired date to select 4 oct 2024
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		//selecting pickup date- 4 Oct 2024 
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"4\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// selecting pickup time- 8 am
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"08:00 AM\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//selecting drop-off date
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"10\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//selecting drop-off time
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"09:00 AM\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on check availability button
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"CHECK AVAILABILITY\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking to ">" button to Navigate back to the homepage
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		//clicking on home icon to Navigate back to the homepage
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"HOME\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on offers button
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Offers\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigating to homepage
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		//clicking on "View All" button
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"VIEW ALL\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking on search by model functionality
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search by Model\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//selecting Honda Activa 6G
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Honda Activa 6G\")")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//closing application
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//closing application
		driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	

	}	   
}
package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class browserTest {

	@Test
	public void openBrowser() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();


		cap.setCapability("deviceName","One plus 5");
		cap.setCapability("udid", "9a0f2cfd");
		
		cap.setCapability("platformversion", "9.0.11");

		
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability("chromedriverExecutable", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		URL url =new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver driver= new AndroidDriver(url,cap);
	
		driver.get("http://google.com");
		
		
		
  }
}

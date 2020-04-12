package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class scrollingDemo {

	@Test
	public void scrolling() throws Exception {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();


		cap.setCapability("deviceName","One plus 5");
		cap.setCapability("udid", "9a0f2cfd");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformversion", "9.0.11");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		URL url =new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver driver= new AndroidDriver(url,cap);
		
		 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		 driver.findElementByXPath("//android.widget.TextView[@text='WebView']").click();
	}

}

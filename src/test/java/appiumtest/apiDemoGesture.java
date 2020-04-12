package appiumtest;

import java.awt.List;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class apiDemoGesture {
	
	@Test
	public void gesture() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();


		cap.setCapability("deviceName","One plus 5");
		cap.setCapability("udid", "9a0f2cfd");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformversion", "9.0.11");

		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		URL url =new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver driver= new AndroidDriver(url,cap);

		Thread.sleep(5000);

		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		((WebElement) driver.findElementsByClassName("android.widget.Button").get(1)).click();


	}

}

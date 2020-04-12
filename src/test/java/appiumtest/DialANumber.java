package appiumtest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialANumber {

	@Test
	public void dialPad() throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();


		cap.setCapability("deviceName","One plus 5");
		cap.setCapability("udid", "9a0f2cfd");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformversion", "9.0.11");

		cap.setCapability("appPackage", "com.android.dialer");
		cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

		URL url =new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver driver= new AndroidDriver(url,cap);

		Thread.sleep(5000);

		driver.findElementById("com.android.dialer:id/normal_imageview").click();


		driver.findElementById("com.android.dialer:id/one").click();
		driver.findElementById("com.android.dialer:id/two").click();
		driver.findElementById("com.android.dialer:id/three").click();
		driver.findElementById("com.android.dialer:id/four").click();
		driver.findElementById("com.android.dialer:id/five").click();
		driver.findElementById("com.android.dialer:id/six").click();
		driver.findElementById("com.android.dialer:id/seven").click();
		driver.findElementById("com.android.dialer:id/eight").click();
		driver.findElementById("com.android.dialer:id/nine").click();
		driver.findElementById("com.android.dialer:id/zero").click();



		driver.findElementById("com.android.dialer:id/dialpad_floating_action_button_1").click();


	}

}
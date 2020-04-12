package appiumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;

import java.net.URL;

import static io.appium.java_client.touch.offset.ElementOption.element;


public class gesturesOne {

	@Test
	public void  longPress() throws Exception {

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
		//Tap
		TouchAction t =new TouchAction(driver);
		WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");

		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		//Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());


	}

}

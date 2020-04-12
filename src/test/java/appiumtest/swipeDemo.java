package appiumtest;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class swipeDemo {
	
	@Test
	public void swipe() throws MalformedURLException {

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
	    driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
	    driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	    driver.findElementByXPath("//*[@content-desc='9']").click();
	    TouchAction t=new TouchAction(driver);
	    WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
		
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		

	    
	
	}
}

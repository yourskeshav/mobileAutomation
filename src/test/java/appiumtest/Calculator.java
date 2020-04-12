package appiumtest;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

@Test
public class Calculator {
	
	static AppiumDriver <MobileElement> driver;
	

	public static void main(String[] args) {
		
		try {
			openCalculator();
		}

		catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			
		}
	}

	@BeforeTest
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability("deviceName","One plus 5");
		cap.setCapability("udid", "9a0f2cfd");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformversion", "9.0.11");
		cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started...");
		
		MobileElement two = driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
		MobileElement add = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
		MobileElement nine = driver.findElement(By.id("com.oneplus.calculator:id/digit_9"));
		MobileElement equals = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
		MobileElement result = driver.findElement(By.id("com.oneplus.calculator:id/result"));
		
		
		
		two.click();
		
		
		add.click();
		
		nine.click();
		equals.click();
		equals.click();
		
		String res = result.getText();
		System.out.println("\n result is :"+ res);
		
		System.out.println("Completed..");
		
		
		
		
	}
}

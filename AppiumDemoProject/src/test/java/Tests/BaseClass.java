package Tests;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends ExtentReportsDemo {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			// caps.setCapability("platformName", "Android");
			caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
			// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G");
			caps.setCapability(MobileCapabilityType.UDID, "ZX1D63J9B5");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			// caps.setCapability(MobileCapabilityType.APP, "");
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			caps.setCapability("chromedriverExecutable", "C:\\Software\\chromDriver78\\chromedriver.exe");

			ChromeOptions co=new ChromeOptions();
			co.setExperimentalOption("w3c", false);
			co.merge(caps);
			
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, co);
			// driver=new AndroidDriver<MobileElement>(url,caps);
			// driver=new IOSDriver<MobileElement>(url,caps);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Cause is " + e.getCause());
			System.out.println("Message is " + e.getMessage());
			e.printStackTrace();
		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

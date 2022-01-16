import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class shadman_test {

	//public static void main(String[] args) throws MalformedURLException {
	 public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	 {

		File appDir = new File("src");
		
		File app = new File(appDir,"ApiDemos-debug.apk"); //app-Ghana-debug-offline.apk //NG_SP16.apk //ApiDemos-debug.apk
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL2XL");
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		cap.setCapability("autoGrantPermissions", "true"); //app permission remover
		
		cap.setCapability("platformVersion", "10");
		
		//UI Automator-->Android apps
		//uiautomator2
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver<AndroidElement> driver =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		return driver;
		
		
	}

}


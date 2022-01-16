import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest extends shadman_test  {

	public static void main(String[] args) throws MalformedURLException {
		
		
AndroidDriver<AndroidElement>driver =capabilities();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		//driver.findElementByAndroidUIAutomator("attribute(\"value\")")
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		//validate clickable feature for all options
		//driver.findElementByAndroidUIAutomator("new Uiselector().property(value)");
		System.out.println(driver.findElementByAndroidUIAutomator("new Uiselector().clickable(true)").getSize());
		
		
		
	}

}

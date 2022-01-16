import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingDemo extends shadman_test {

	public static void main(String[] args) throws MalformedURLException {
	

AndroidDriver<AndroidElement>driver =capabilities();
		
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"); //scrooling
		
	}

}

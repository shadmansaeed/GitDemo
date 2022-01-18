import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions; //manually written 

import static io.appium.java_client.touch.offset.ElementOption.element; //manually written

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;




public class gesture extends shadman_test {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		AndroidDriver<AndroidElement> driver =capabilities();

	    driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    
	    
	    WebElement expandablelist = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
	    
	    //single tap

	    new TouchAction(driver).tap(tapOptions().withElement(element(expandablelist))).perform();
	     
	    Thread.sleep(1000);
	    
	    driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	    
	    
	  
	    Thread.sleep(1000);
	    
	    
	    
	    
	  
	    //long press
	    
	    
	    MobileElement longpress = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
	    
	    	    LongPressOptions longPressOptions = new LongPressOptions();
	    	    
	    	    longPressOptions.withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(longpress));
	    	    
	    	    TouchAction action = new TouchAction(driver);
	    	    action.longPress(longPressOptions).release().perform();
	    	    
	    	    
	    	    
	    

		

	}

}

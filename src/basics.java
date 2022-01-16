import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends shadman_test {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement>driver =capabilities();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//xpath id classname, androiduiautomator
		 
		/*  xpath syntax
		 *  //tagname[@attribute='value']
		 * 
		 * 
		 * 
		 */
    
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();

		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
		
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		
	}

}

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NG extends shadman_test {

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
    
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		//driver.findElement(By.id("android:id/checkbox")).click();

		//driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		
		//driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
		
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='User Login']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Test@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Online Mode']")).click(); //select online mode
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click(); //click on login button
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Transaction']")).click(); //click on loan transaction
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select Branch']")).click(); //click on select branch
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='ASHA MFB ABAGANA (438) [2021-10-29]']")).click();
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Select Loan Officer")).click();
		
		driver.findElementsByClassName("android.widget.TextView").get(6).click(); //click on select loan officer 
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='AGWI MARY (2324)']")).click(); //select loan officer
		
		
		driver.findElementsByClassName("android.widget.TextView").get(10).click(); //click on select member
		Thread.sleep(1000);
		
		driver.findElementsByClassName("android.widget.TextView").get(2).click(); //select member
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select Loan Account']")).click(); //click on select loan account
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Small Loan']")).click(); 
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//android.widget.TextView)[2]")).click(); //topup loan selected
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select Process']")).click();  //select process
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//android.widget.TextView)[2]")).click(); //cash selected
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select Type']")).click(); //select type
		
		Thread.sleep(2000);
		
		driver.findElementsByClassName("android.widget.TextView").get(0).click();
		
		Thread.sleep(5000);
		
		driver.findElementsByClassName("android.widget.TextView").get(1).click();
		
		//driver.findElementsByClassName("android.widget.TextView").get(2).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}

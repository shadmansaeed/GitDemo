import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MM extends shadman_test {

 public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
   AndroidDriver<AndroidElement>driver =capabilities();
		
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
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
			
	driver.findElement(By.xpath("//android.widget.TextView[@text='Aunglan - Magway (85) [2021-10-12]']")).click(); //select branch
	Thread.sleep(1000);
	
	driver.findElementsByClassName("android.widget.TextView").get(6).click(); //click on select loan officer
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Mr Aung Thet Naing (1993)']")).click(); //select loan officer
	
	driver.findElementsByClassName("android.widget.TextView").get(10).click(); //click on select member
	Thread.sleep(1000);
	
	driver.findElementsByClassName("android.widget.TextView").get(2).click(); //select member
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Select Process']")).click();  //select process
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//android.widget.TextView)[2]")).click(); //cash selected
	Thread.sleep(1000);
	

	
	driver.findElement(By.xpath("//android.widget.TextView[@text='Select Type']")).click(); //select type
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[contains(text(), 'Loan Collection')]")).click();
	/*
	List<AndroidElement> elList = driver.findElementsByClassName("android.widget.spinner");
    System.out.println("found number of elements: " + elList.size());
    if (!elList.isEmpty()) { //we got some elements  */
        // try first one  
    	

      //  elList.get(0).sendKeys("Select");
     //   try {Thread.sleep(10000);} catch (Exception e) {}
        // check if we had effect
        
        // now other way
     //   elList.get(0).setValue("Loan Collection");
        
     //   elList.get(0).setValue("Loan other");

    }
//    
// Spineer aa=   driver.findElements(MobileBy.className("android.widget.spinner");
//	Thread.sleep(1000);
	
//Thread.sleep(1000);
	
    
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Collection']")).click(); //select loan officer
   //driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Loan Collection\")").click();
	
	//driver.findElementsByClassName("android.widget.Spinner").get(1).click();
	
	//driver.findElementByAndroidUIAutomator("new UiSelector().text(Loan Collection)").click();
	
	//Thread.sleep(1000);
	
	//driver.findElement(By.id("com.ambs.mobile:id/etAmount_P_LoanTransaction")).sendKeys("100"); //ammount field
	
	//Thread.sleep(1000);
  //  driver.findElement(By.id("com.ambs.mobile:id/etDescription_P_LoanTransaction")).sendKeys("Transaction"); //Description
    
  //  Thread.sleep(1000);
    
    //driver.findElement(By.id("com.ambs.mobile:id/action_save_p_loan_transaction")).click(); //save
    
 
    
    
 //driver.findElementByAndroidUIAutomator("text(\"Loan Collection\")").click();
    
	//driver.findElement(By.id("com.ambs.mobile:id/txtValue_Spinner")).click(); 
    
 //  driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Loan Collection\")").click();
	

	
	//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Loan Collection\"));")).click();
    
    
	}
 



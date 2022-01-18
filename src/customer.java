import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.collections.Lists;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class customer extends shadman_test {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		 AndroidDriver<AndroidElement>driver =capabilities();
			
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//android.widget.EditText[@text='User Login']")).sendKeys("admin");
			
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Test@123");
			
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Online Mode']")).click(); //select online mode
			
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click(); //click on login button
			
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("text(\"Member\")").click(); //click member
		
		driver.findElement(By.id("com.ambs.mobile:id/action_add_p_member")).click(); //click on member add button
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("text(\"Select Branch\")").click(); // click select branch
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("text(\"Aunglan - Magway (85) [2021-10-12]\")").click(); //select branch
		
		
		driver.findElementByAndroidUIAutomator("text(\"Select Loan Officer\")").click(); //click on select loan officer
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("text(\"Mr Aung Thet Naing (1993)\")").click(); // select loan officer
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("text(\"Select Group\")").click(); //click on Select Group
		Thread.sleep(2000);
		
        driver.findElementByAndroidUIAutomator("text(\"Gold\")").click(); //group selected
        Thread.sleep(2000);
        
        driver.findElement(By.id("com.ambs.mobile:id/btnAdmissionDate_P_MemberAdd")).click(); //click on calendar icon
        Thread.sleep(2000);
        
        
        driver.findElement(By.id("android:id/prev")).click(); //november
        

        Thread.sleep(2000);
        driver.findElement(By.id("android:id/prev")).click(); //october
        driver.findElement(By.id("android:id/prev")).click(); //september
       // driver.findElement(By.id("android:id/prev")).click(); //august
        //driver.findElement(By.id("android:id/prev")).click(); //july
        //driver.findElement(By.id("android:id/prev")).click(); //june
        //driver.findElement(By.id("android:id/prev")).click(); //may
        
        Thread.sleep(500);
        driver.findElementByAndroidUIAutomator("text(\"12\")").click(); // date picked
        
        Thread.sleep(2000);
        driver.findElementByAndroidUIAutomator("text(\"OK\")").click(); // CLICK OK
        
        Thread.sleep(2000);
        driver.findElement(By.id("com.ambs.mobile:id/spnNidType_P_MemberAdd")).click(); //click kyc ID type
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='National ID']")).click(); //select kyc id type
        
        Thread.sleep(2000);
        driver.findElement(By.id("com.ambs.mobile:id/etNidNumber_P_MemberAdd")).sendKeys("87695432980"); //type KYC with sendkeys
        
        //Thread.sleep(2000);
       // driver.findElement(By.id("com.ambs.mobile:id/etPassbookNumber_P_MemberAdd")).sendKeys("8475"); //passbook 
        
        Thread.sleep(2000);
        driver.findElement(By.id("com.ambs.mobile:id/etFullName_P_MemberAdd")).sendKeys("TOWFIQ"); //fullname
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("com.ambs.mobile:id/etMiddleName_P_MemberAdd")).sendKeys("RAHMAN"); //middlename
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("com.ambs.mobile:id/btnDateOfBirth_P_MemberAdd")).click(); //click on calendar button
        
        
        
        
        
        
        Thread.sleep(500);
        driver.findElement(By.id("android:id/date_picker_header_year")).click(); //header year click
        
        
        // year selected of upper scrolling
        Thread.sleep(2000);
        
        
        Dimension windowSize = driver.manage().window().getSize();
        Map<String, Object> args1 = new HashMap<>();
        args1.put("command", "input");
        args1.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
                windowSize.height / 2, windowSize.width / 2, windowSize.height));
        while (driver.findElements(By.xpath("//android.widget.TextView[@text='2002']")).size() == 0) {
            driver.executeScript("mobile: shell", args1);
        }
        driver.findElement(By.xpath("//android.widget.TextView[@text='2002']")).click();
        
        
        
        
        
        
        
        
        
       // driver.findElementByAndroidUIAutomator("text(\"2000\")").click(); //year 2000 click 
        
       // driver.findElementsByClassName("android.widget.TextView").get(4).click();
        
        
        
       // Thread.sleep(2000);
        //driver.findElementByAndroidUIAutomator("text(\"6\")").click(); //date picked
        
        
        Thread.sleep(2000);
        driver.findElementByAndroidUIAutomator("text(\"OK\")").click(); // CLICK OK
        
        
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("com.ambs.mobile:id/spnProofOfAge_P_MemberAdd")).click(); //click proof of age
        
        Thread.sleep(2000);
        
        driver.findElementByAndroidUIAutomator("text(\"Passport\")").click(); //proof of age selected
        
       // driver.findElement(By.id("com.ambs.mobile:id/etContactNumber_P_MemberAdd")).sendKeys("89076543786");
        
      //  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(description(\"Tin Number\"));"); //scrolling
        
       // driver.findElementsById("com.ambs.mobile:id/etContactNumber_P_MemberAdd").get(1).click();
        
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().textContains(\"Tin Number\"))");  //scroll to tin number
        
        
        Thread.sleep(2000);
        driver.findElement(By.id("com.ambs.mobile:id/spnReligion_P_MemberAdd")).click(); //click religion
        
        Thread.sleep(2000);
        driver.findElementByAndroidUIAutomator("text(\"Islam\")").click(); //select religion 
        
        Thread.sleep(2000);
        driver.findElement(By.id("com.ambs.mobile:id/spnCaste_P_MemberAdd")).click(); //click caste
        
        Thread.sleep(2000);
        driver.findElementByAndroidUIAutomator("text(\"GENERAL\")").click(); //select caste
        
        Thread.sleep(2000);
        
         driver.findElement(By.id("com.ambs.mobile:id/etContactNumber_P_MemberAdd")).sendKeys("89076543786"); //contact number
         
         Thread.sleep(2000);
         driver.findElement(By.id("com.ambs.mobile:id/spnProofOfAddress_P_MemberAdd")).click(); //click on proof of address
                    
         
         Thread.sleep(2000);
         driver.findElementByAndroidUIAutomator("text(\"Job Card\")").click(); //select proof of address
         
         
         Thread.sleep(500);
         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                 ".scrollIntoView(new UiSelector().textContains(\"Postal Address\"))");  //scroll to Postal Address
         
         
         Thread.sleep(2000);
         driver.findElement(By.id("com.ambs.mobile:id/chkAmlVerified_P_MemberAdd")).click(); //click on anti money laundaring checkbox
         
         
         
         Thread.sleep(2000);
         
         driver.findElement(By.id("com.ambs.mobile:id/action_save_p_member")).click(); //click save button
         
         
         Thread.sleep(3000);
         driver.findElement(By.id("com.ambs.mobile:id/btnYes_DialogConfirmationYesNo")).click(); //click ok button
         
         
         Thread.sleep(3000);
         driver.navigate().back(); //click back after crweating member
         
         Thread.sleep(2000);
         driver.findElementByAndroidUIAutomator("text(\"Select Branch\")").click(); // click select branch
         
 		 Thread.sleep(2000);
 		 driver.findElementByAndroidUIAutomator("text(\"Aunglan - Magway (85) [2021-10-12]\")").click(); //select branch
         
         
 		driver.findElementByAndroidUIAutomator("text(\"Select Loan Officer\")").click(); //click on select loan officer
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("text(\"Mr Aung Thet Naing (1993)\")").click(); // select loan officer
		Thread.sleep(3000);
		
		driver.findElementByAndroidUIAutomator("text(\"Apple(TUE)\")").click(); //click on Select Group
		
		Thread.sleep(2000);
		
		
		
        driver.findElementByAndroidUIAutomator("text(\"Gold(MON)\")").click(); //group selected
        
        
        Thread.sleep(1500);
         
             driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().textContains(\"TOWFIQ\"))");  //scroll to Postal Address
             
          
             Thread.sleep(4000);
            driver.navigate().back(); //navigate back
            
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click(); //click more options(three dot)
            
            Thread.sleep(2000);
            driver.findElement(By.id("com.ambs.mobile:id/content")).click(); //click on logout
            
            Thread.sleep(2000);
            driver.findElement(By.id("android:id/button1")).click(); //click on yes button
            
        
       // List<AndroidElement> pick = driver.findElements(By.className("android.widget.ImageButton"));   
         
         //Yes

       // pick.get(0).sendKeys("21");
        //pick.get(1).sendKeys("Mar");
       // pick.get(2).sendKeys("2001");
         // pick.get(2).sendKeys("2001");
	}

}

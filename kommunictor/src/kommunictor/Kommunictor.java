package kommunictor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kommunictor {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			 System.setProperty("webdriver.chrome.driver",
					 "D:\\prasannakumar\\Prasanna_webdriver\\chromedriver.exe");  
			 
	     // Instantiate a ChromeDriver class.     
	     WebDriver driver=new ChromeDriver();  
	     //Maximize the browser  
	    driver.manage().window().maximize();  
	       // Launch Web site  
	    driver.get("http://kommunicator-admin-frontend.herokuapp.com/");  
	    
	    driver.findElement(By.id("input-15")).sendKeys("kiran.capoor@beamx.co");
	    driver.findElement(By.id("input-18")).sendKeys("samatron56@VV");
        driver.findElement(By.xpath("//button[@type='button']//*")).click();
        Thread.sleep(5000);
        
        String actualurl = "http://kommunicator-admin-frontend.herokuapp.com/dashboard/analytics";
        String expectedUrl= driver.getCurrentUrl();
        System.out.println("actualurl  == " +actualurl);
        System.out.println("expectedUrl == "+expectedUrl);
        
        if(actualurl.equalsIgnoreCase(expectedUrl))
        { 
      	  System.out.println("Login sucessfully");
      	  } 
        else {
      	  System.out.println("Test failed");
        }
        Thread.sleep(5000);
        //-----------------Login function completed------------------------------------------//
        
        //-------------Request section-------------------------------------------------------//
        driver.findElement(By.xpath("//a[@href='/users/list']//div[@class='v-list-item__title']")).click();
        System.out.println("User Request section shown sucessfully");
        Thread.sleep(10000);
        
        //-------------------Existing users----------------------------------------------//
        driver.findElement(By.xpath("//a[@href='/users/existuserlist']//div[@class='v-list-item__title']")).click();
        Thread.sleep(10000);
        System.out.println("Existing user section shown sucessfully");
        
       //-------------------------Plans section----------------------------------------//
        driver.findElement(By.xpath("//a[@href='/plans/list']")).click();
        Thread.sleep(10000);
        System.out.println("Plans section shown sucessfully");
        
        //----------------Create plans section------------------------------------//
        driver.findElement(By.xpath("//*[text()=' Create Plan ']")).click();
        System.out.println("Create plan Pop-up section is shown Sucessfully");
        Thread.sleep(10000);
//        
//        driver.findElement(By.xpath("//*[text()=' Settings ']")).click();
//        System.out.println("Settings Section shown sucessfully");
//        
        driver.findElement(By.xpath("")).click();
	}

}

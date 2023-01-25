package mySamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my First Page:");
		
		// System Property for Chrome Driver   
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver();  

	    driver.get("https://www.javatpoint.com/");	
	}

}

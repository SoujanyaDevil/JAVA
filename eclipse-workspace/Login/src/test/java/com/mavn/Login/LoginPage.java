package com.mavn.Login;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		String Actual=driver.getCurrentUrl();
		System.out.println(Actual);
		String Expected="https://phptravels.com/demo/";
		
		if(Actual.equalsIgnoreCase(Expected))
		{
			System.out.println("Both are Matched");
		}
		else
		{
			System.out.println("Both are not Matched");
		}
		Thread.sleep(10000);
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
		WebElement login=driver.findElement(By.tagName("//a[contains(text(),'Login')]"));
		login.click();
		login.isDisplayed();
		login.isEnabled();
		
		Set<String> S=driver.getWindowHandles();
		Iterator<String> Iter=S.iterator();
		String ParentId=Iter.next();
		String ChildId=Iter.next();
		
		driver.switchTo().window(ChildId);
		String CId=driver.getCurrentUrl();

		System.out.println(CId);
		

	}

}

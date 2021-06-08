package com.mavn.Login;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
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
		Thread.sleep(3000);
		driver.findElement(By.tagName("//a[contains(text(),'Login')]")).click();
		
		Set<String> S=driver.getWindowHandles();
		Iterator<String> Iter=S.iterator();
		String ParentId=Iter.next();
		String ChildId=Iter.next();
		
		driver.switchTo().window(ChildId);
		String CId=driver.getCurrentUrl();

		System.out.println(CId);
		

	}

}

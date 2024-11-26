package Threadsafetyconceptparallel;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DriverTest1 {
       
	
	WebDriver driver;
	
	
	@Test
	void myTest1() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

	
	@Test
	void myTest2() {
		
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}

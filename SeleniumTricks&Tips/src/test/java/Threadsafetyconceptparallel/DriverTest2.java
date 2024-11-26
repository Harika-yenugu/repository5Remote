package Threadsafetyconceptparallel;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DriverTest2 {
        
	public static ThreadLocal <WebDriver>tdriver=new ThreadLocal<>();
	
	WebDriver driver;
	 
	public  void setDriver(WebDriver driver) {
		tdriver.set(driver);
	}
	public WebDriver getDriver() {
		return tdriver.get();
		
	}
	
	@Test
	void myTest1() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		setDriver(driver);
		getDriver().get("https://www.google.com/");
		System.out.println(getDriver().getTitle());
		getDriver().close();
	}

	
	@Test
	void myTest2() {
		
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		setDriver(driver);
		getDriver().get("https://www.bing.com/");
		System.out.println(getDriver().getTitle());
		getDriver().close();
	}

}

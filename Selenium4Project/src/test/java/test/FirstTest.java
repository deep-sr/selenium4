package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./browser/geckodriver.exe");
	//WebDriverManager.firefoxdriver().setup();
	//WebDriverManager.chromedriver().driverVersion("98.0.4758.80").setup();
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver= new ChromeDriver();
	//WebDriverManager.edgedriver().setup();
	WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new EdgeDriver();
	
	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 
	 
	driver.get("https://www.google.com");
	driver.close();
}
}

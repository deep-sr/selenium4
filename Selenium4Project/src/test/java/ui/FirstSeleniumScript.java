package ui;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
	//System.setProperty("webdriver.edge.driver", "C:\\Deepika\\Automation_software\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Deepika\\Automation_software\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.close();
	}

}

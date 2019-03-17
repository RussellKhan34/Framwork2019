package Test.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\rus\\OneDrive\\Documents\\GitHub\\Framwork2019\\Drivers\\Chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Russel");
	}

}

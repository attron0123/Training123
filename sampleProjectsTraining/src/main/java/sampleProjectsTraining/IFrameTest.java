package sampleProjectsTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTest {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strlb = driver.findElement(By.xpath("//label/span")).getText();
		//MainPage- frame1
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='Text']")).sendKeys("Hello Welcome");
		//frame1 to fram3
		driver.switchTo().frame("frame3");
		driver.switchTo().frame(0);
		driver.findElement((By.id("a"))).click();
		//frame3 to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='Text']")).sendKeys("Welcome back");
		
		
	}

}

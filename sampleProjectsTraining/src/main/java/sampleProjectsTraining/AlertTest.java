package sampleProjectsTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	    driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	    Thread.sleep(1000);
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg][1]"));
	    Alert confirm = driver.switchTo().alert();
	    confirm.accept();
	    confirm.dismiss();
	
	}

}

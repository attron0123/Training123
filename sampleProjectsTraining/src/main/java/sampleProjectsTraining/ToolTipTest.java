package sampleProjectsTraining;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        WebElement age = driver.findElement(By.id("age"));	
	}

}

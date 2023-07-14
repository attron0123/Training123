//package sampleProjectsTraining;
//
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WindowsHandle {
//	public static void main(String args[]) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://stqatools.com/demo/Windows.php");
//		String parentWin = driver.getWindowHandle();
//		System.out.print("Parent Handle" + parentWin);
//		driver.findElement(By.xpath("//button[contains(text(), 'new Tab'"));
//		String tabs = driver.getWindowHandle();
//		for(String child: tabs) {
//			System.out.println(child);
//			if(!child.equalsIgnoreCase(parentWin)) {
//				driver.switchTo().window(child);
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//span[@class='menu-text'])[2]")).click();
//			}
//		}
//	    driver.close();
//	    driver.switchTo().window(parentWin);
//	    driver.findElement(By.xpath("//button[contains(text(),'new Window')"));
//	    driver.quit();
//	}

//}

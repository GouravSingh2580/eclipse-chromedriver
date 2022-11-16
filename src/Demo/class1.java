package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/singh/Documents/virtusa-training/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.className("gLFyf")).sendKeys("weather now");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("gNO89b")).click();
		Thread.sleep(3000);
		driver.close();
	}

}

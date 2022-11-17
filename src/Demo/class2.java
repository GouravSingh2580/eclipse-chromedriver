package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/singh/Documents/virtusa-training/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fish oil");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("HealthKart")).click();
		Thread.sleep(5000);
		driver.close();
	}

}

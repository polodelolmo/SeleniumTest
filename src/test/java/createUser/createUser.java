package createUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://svgt210.serverneubox.com.mx:2083/");

		Thread.sleep(2000);
		driver.findElement(By.id("user")).clear();
		driver.findElement(By.id("user")).sendKeys("jjmasonc");
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys("tn27N7b.v.W3FR");
		driver.findElement(By.id("login_submit")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#item_email_accounts > .itemTextWrapper")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnCreateEmailAccount")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".chosen-single > span")).click();
		driver.findElement(By.cssSelector(".active-result:nth-child(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtUserName")).click();
		driver.findElement(By.id("txtUserName")).sendKeys("mike002");
		Thread.sleep(2000);
		driver.findElement(By.id("txtEmailPassword")).click();
		driver.findElement(By.id("txtEmailPassword")).sendKeys("Test@321tyr.");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("section > .row")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".button-label > span")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}

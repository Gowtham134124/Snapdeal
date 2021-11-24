package createNew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		WebElement movetoshirt = driver.findElement(By.xpath("//li[@class='navlink lnHeight']//span[@class='catText'][1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(movetoshirt).perform();
		Thread.sleep(500);
		//(//a[@data-index= '1.2.3'])/span[text() = 'Shirts']
		//WebElement clickshirt = driver.findElement(By.xpath("((//a[@data-index= '1.2.3'])/span[text() = 'Shirts']"));
				
		WebElement clickshirt = driver.findElement(By.xpath("(//span[text() = 'Jeans'])/preceding::span[text() = 'Shirts'][2]"));
		Thread.sleep(500);
		builder.moveToElement(clickshirt).perform();
		//driver.findElement(By.xpath("//a[@class='rightMenuLink  noHasTagWidth dp-widget-link']/span[text()='Shirts'][1]")).click();
		
		clickshirt.click();
		WebElement firstsel = driver.findElement(By.xpath("//span[@id='display-price-635852155522']"));
		builder.moveToElement(firstsel).perform();
		WebElement clickquick = driver.findElement(By.xpath("//div[@pogid='635852155522']"));
		builder.moveToElement(clickquick).perform();
		clickquick.click();
		driver.quit();
		
		
	}
	

}

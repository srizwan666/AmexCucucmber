package cvs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW22 {
	

		
		static WebDriver driver;
		
	
	@BeforeMethod
	
	public void BrowserOpen() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\git\\practice\\rizwan\\src\\main\\java\\rizwan\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void SearchKeyword()  {
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("AmEx");
			
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
			System.out.println(searchResults.size());

			for(int i = 0; i < searchResults.size(); i++) {
				String searchIteams = searchResults.get(i).getText();
				if(searchIteams.contains("AmEx")) {
					searchResults.get(i).click();
					break;
				}}
		
			driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click(); }

	
	
	
	
	
	
	
	

}

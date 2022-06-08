package implicitExplicitWait;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ImplicitWait {
	WebDriver driver ;
	
	@Test
	
	public void registration() {
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\CHromeDriver_102\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
	}

	@AfterTest
	public void quit()
	{
		driver.close();
	}
}

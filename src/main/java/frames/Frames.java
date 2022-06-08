package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;

	By click1 = By.xpath("//button[@id=\"Click\"]");
	By click2 =By.xpath("//button[@id=\"Click1\"]");
	
	@Test(priority = 0)
		public void registration() {
			
			System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\CHromeDriver_102\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/frame.html");
			driver.manage().window().maximize();
			
			//frame 1
			driver.switchTo().frame(0);
			driver.findElement(click1).click();
			driver.switchTo().parentFrame();
			//frame 2
			driver.switchTo().frame(1);
			driver.switchTo().frame("frame2");
			driver.findElement(click2).click();
			driver.switchTo().parentFrame();
			
			//total no of frame
			
			List<WebElement> frame =  driver.findElements(By.tagName("iframe"));
			System.out.println(frame.size());
			
			
		}

}

package actionsMETHOD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsMethod {
WebDriver driver;

@Test(priority = 0)
	public void registration() {
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\CHromeDriver_102\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
	
	}
@Test(priority = 1)
	public void dragg() {
	
	
		WebElement draggable = driver.findElement(By.xpath("//a[contains(.,'Draggable')]"));
		draggable.click();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act = new Actions (driver);
		act.moveToElement(drag).clickAndHold().moveByOffset(170, 100).release().build().perform();
		driver.navigate().back();
	}
@Test(priority = 2)
public void dropp()
{
	WebElement dropable = driver.findElement(By.xpath("//a[contains(.,'Droppable')]"));
	dropable.click();
	driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//p[contains(.,'Drag me to my target')]"));
		WebElement target = driver.findElement(By.xpath("//p[contains(.,'Drop here')]"));
		Actions act = new Actions (driver);
		act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
}

/*act.moveToElement(link).build().perform();

act.moveToElement (link).click().build().perform();

act.moveToElement(link).clickAndHold().build().perform();

act.moveToElement(link).contextClick().build().perform();

act.moveToElement (link).doubleClick().build().perform();

act.moveToElement(drag).clickAndHold().moveByOffset(170, 100).release().build().perform();

act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();*/


}

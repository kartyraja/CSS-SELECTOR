import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	static WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {
		

System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.bobcat.com/in/en/index");
		printElement();
	}
public static void printElement() throws InterruptedException
{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div//a//i")).click();
Thread.sleep(1000);
	driver.findElement(By.cssSelector("ul#main-nav  li[class='level-1 dtm-hdr-dsk-nav']:nth-of-type(3)")).click();
Thread.sleep(1000);

List<WebElement> list = driver.findElements(By.cssSelector("div>a>div:nth-of-type(1)"));

for (int i = 7; i <=10; i++) {
	
	System.out.println(list.get(i).getText());
}
}
}




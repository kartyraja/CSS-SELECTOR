import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) {
		
WebDriver driver;	
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.guru99.com/");


List<WebElement> list = driver.findElements(By.cssSelector("div[class*='featured-box'] h4"));
for (WebElement webElement : list) {
	System.out.println(webElement.getText());
}


	}

}

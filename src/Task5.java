import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver;	
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://fast.com/");
Thread.sleep(5000);
System.out.println(driver.findElement(By.cssSelector("div#speed-value")).getText());	

driver.quit();
}

}



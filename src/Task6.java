import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver;	
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\telecom\\jar\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.netflix.com/in/login");
Thread.sleep(1000);
	driver.findElement(By.cssSelector("label.input_id>input")).sendKeys("kartyuu");
	driver.findElement(By.cssSelector("label.input_id [name='password']")).sendKeys("12345689");
	driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	
	System.out.println(driver.findElement(By.cssSelector("div.ui-message-contents")).getText());
	
	}

}



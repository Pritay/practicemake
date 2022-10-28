import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritay\\OneDrive\\Desktop\\Browsers Jar\\Chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
//		username.sendKeys("pritaybadge04@gmail.com");
//		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
//		password.sendKeys("Pritay@04");
//		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
//		button.click();
//		WebElement disp = driver.findElement(By.xpath("//input[@name='email']"));
//		System.out.println(disp.isEnabled());
//		driver.get("https://www.facebook.com/reg/");
//		WebElement rdio = driver.findElement(By.xpath("//input[@type='radio'and@value='1']"));
//		System.out.println(rdio.isSelected())
	    List<WebElement> list = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));	
	    System.out.println(list.size());
	    for(int i=0;i<list.size();i++) {
	    	WebElement  li = list.get(i);
	       
	    }
	
	}

}

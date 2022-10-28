import java.util.concurrent.TimeUnit;

import org.bouncycastle.pqc.crypto.DigestingStateAwareMessageSigner;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritay\\OneDrive\\Desktop\\Crome104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
//		Dimension d = new Dimension(100,400);
//		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Point p = new Point(100,400);
//		driver.manage().window().setPosition(p);
		
		Dimension d = new Dimension(100, 400);
		driver.manage().window().setSize(d);
		String title = driver.getTitle();	
		System.out.println(title);
		
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();		
	}

}

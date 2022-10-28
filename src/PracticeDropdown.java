import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropdown {
	
	private static final String Takescreenshot = null;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritay\\OneDrive\\Desktop\\Crome104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByIndex(3);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select ms = new Select(month);
		ms.selectByValue("7");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ys = new Select(year);
		ys.selectByVisibleText("1994");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Automation Screenshot\\facebook64.png");
		FileUtils.copyFile(source, destination);
		
		
	}

}

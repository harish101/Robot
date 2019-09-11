import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindq\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://imgbb.com/");
		
		driver.findElement(By.xpath("//*[@id=\"home-cover-content\"]/div[2]/a")).click();
		
		Robot r = new Robot();
		
		StringSelection ss = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}

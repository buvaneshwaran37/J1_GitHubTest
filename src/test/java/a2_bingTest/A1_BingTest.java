package a2_bingTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_BingTest {
	
	@Test
	public void verifygooglepage() throws IOException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		
		File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src, new File("C:\\BATCH251\\J1_GitHubTest\\screenshotgithub\\bing.png"));
	
	    wd.quit();
	}

}

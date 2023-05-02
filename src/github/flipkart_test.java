package github;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class flipkart_test {

	
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http:///wwww.amazon.com");
		//take screenshot
		TakesScreenshot s=((TakesScreenshot)driver);
		File src=s.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Hp\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\notepad/img_03.png";
		File dest=new File(path);
		Files.copy(src, dest);

	}

}
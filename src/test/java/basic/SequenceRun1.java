package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class SequenceRun1 {

ChromeDriver driver = new ChromeDriver();
	
@Test
	public void LaunchBrowser() throws IOException
	{
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Proofs/img1.png");
		FileHandler.copy(scr, dest);
	}
}

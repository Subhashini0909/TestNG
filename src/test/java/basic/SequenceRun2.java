package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class SequenceRun2 {

ChromeDriver driver = new ChromeDriver();
	
@Test
	public void LaunchBrowser() throws IOException
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Proofs/img2.png");
		FileHandler.copy(scr, dest);
	}
	
}

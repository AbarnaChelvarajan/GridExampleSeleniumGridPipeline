package TestGRIDExample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GRIDExampleTest {
	WebDriver driver;
	
@SuppressWarnings("deprecation")
@Test
public void testingGRID() throws MalformedURLException {
	//driver=new ChromeDriver();
	
	 DesiredCapabilities desired=new DesiredCapabilities();
	 desired.setBrowserName("firefox");
	 desired.setPlatform(Platform.WIN11);
	 driver=new RemoteWebDriver(new URL("http://192.168.31.240:4444/"), desired);
	
	driver.get("https://linkedin.com");
	driver.quit();
	
}

@Test
public void testingGRIDfirefox() throws MalformedURLException {
	//driver=new ChromeDriver();
	
	 DesiredCapabilities desired=new DesiredCapabilities();
	 desired.setBrowserName("firefox");
	 desired.setPlatform(Platform.WIN11);
	 driver=new RemoteWebDriver(new URL("http://192.168.31.240:4444/"), desired);
	
	driver.get("https://linkedin.com");
	driver.quit();
	
}
	
	
}

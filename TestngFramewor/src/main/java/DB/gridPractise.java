package DB;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridPractise {
	WebDriver dr;
	
	@Test
	public void Test1() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.MAC);
	    dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	}
	
	public void Test2() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.MAC);
	    dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	}
	
}

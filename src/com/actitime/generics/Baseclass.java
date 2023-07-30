package com.actitime.generics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.Homepage;
import com.actitime.pom.LoginPage;

public class Baseclass {
	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void closebrowser() {
		Reporter.log("closing browser", true);
		driver.close();
	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		Reporter.log("login", true);
		Filelib f = new Filelib();
		String url = f.getProperty("url");
		String username = f.getProperty("username");
		String password = f.getProperty("password");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.setLogin(username, password);

	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
		Homepage h = new Homepage(driver);
		h.setLogout();

	}

}

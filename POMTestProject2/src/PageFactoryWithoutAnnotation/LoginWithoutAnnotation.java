package PageFactoryWithoutAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutAnnotation {
	
  public static WebElement	txtUsername;
  public static WebElement	txtPassword;
  public static WebElement	btnLogin;

  @Test
public void login() {

	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	  PageFactory.initElements(driver, LoginWithoutAnnotation.class);
	  txtUsername.sendKeys("Admin");
	  txtPassword.sendKeys("admin123");
	  btnLogin.click();
	  
		
		
}
}

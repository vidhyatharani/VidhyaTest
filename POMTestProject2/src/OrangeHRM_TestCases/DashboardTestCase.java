package OrangeHRM_TestCases;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_PageObjects.DashboardObjects;

import OrangeHRM_PageObjects.LoginPageObjects;

public class DashboardTestCase {
	List<WebElement> list;
		
	@Test
	public void dashboardTimesheet() 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.loginButton.click();
		
			
		PageFactory.initElements(driver, DashboardObjects.class);
		
		DashboardObjects.timesheet.click();
		DashboardObjects.employee.clear();
		DashboardObjects.employee.sendKeys("Pa");
		list = DashboardObjects.listElement;
			
				
		for (WebElement webElement : list) {
			if(webElement.getText().equals("Nina Patel")){
				webElement.click();
				break;
			}
		}
		
		DashboardObjects.viewBtn.click();
		
		}

}

package OrangeHRM_PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardObjects {

	@FindBy(xpath = "//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[3]/div/a")
	public static WebElement timesheet;
	
	@FindBy(id="employee")
	public static WebElement employee;
	
	@FindBy(xpath = "/html/body/div[4]/ul/li")
	public static List<WebElement> listElement;
	
	@FindBy(id="btnView")
	public static WebElement viewBtn;
}

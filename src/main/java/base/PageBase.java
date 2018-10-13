package base;

import org.openqa.selenium.WebDriver;

public class PageBase {
	public static WebDriver driver;
	public static boolean bResult;
	
	public  PageBase(WebDriver driver){
		this.driver = driver;
		this.bResult = true;
	}
}

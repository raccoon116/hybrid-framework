package pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;
import base.TestBase;
import util.LogManager;
import util.WaitConf;

public class Home extends PageBase {
	private final Logger log = LogManager.getLogger(Home.class);
	WaitConf waitConf;
	
	String Tshirts = "T-shirts";
	String Blouses = "Blouses";
	String CasualDresses = "Casual Dresses";

	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="pass")
	public WebElement password;
	
	
	@FindBy(id="loginbutton")
	public WebElement loginbtn;

	
	public Home(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		waitConf = new WaitConf(driver);
//		waitConf.waitForElement(driver, womenMenu,new Config(TestBase.OR).getExplicitWait());
	}
	
	public void mouseOver(String data){
		log.info("doing mouse over on :"+data);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"))).build().perform();
	}
	
/*	public ProductCategoryPage clickOnIntem(String data){
		log.info("clickin on :"+data);
		driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]")).click();
		return new ProductCategoryPage(driver);
	}
	
	public ProductCategoryPage clickOnMenu(WebElement element){
		log.info("clickin on : "+element.getText());
		element.click();
		return new ProductCategoryPage(driver);
	}*/

}

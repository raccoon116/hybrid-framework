package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties OR;
	public File f1;
	public FileInputStream file;
	
	public ConfigReader() throws IOException{
		OR = new Properties();
		f1 = new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		file = new FileInputStream(f1);
		OR.load(file);
	}

	public void loadPropertiesFile() throws IOException{
		
		
		
//		logger.info("loading config.properties");
		
//		f1 = new File(System.getProperty("user.dir")+"/src/main/resources/config/or.properties");
//		file = new FileInputStream(f1);
//		OR.load(file);
//		logger.info("loading or.properties");
		
	}

	
	
	
	
	
	public String getBrowser() {
		return OR.getProperty("Browser");
	}
	public String getDriverPath() {
		return OR.getProperty("DriverPath");
	}

	
	
	
	public String getUserName() {
		return OR.getProperty("Username");
	}

	public String getPassword() {
		return OR.getProperty("Password");
	}

	public String getWebsite() {
		return OR.getProperty("Website");
	}
	
	public int getPageLoadTimeOut() {
		return Integer.parseInt(OR.getProperty("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(OR.getProperty("ImplcitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(OR.getProperty("ExplicitWait"));
	}

	public String getDbType() {
		return OR.getProperty("DataBase.Type");
	}

	public String getDbConnStr() {
		return OR.getProperty("DtaBase.ConnectionStr");
	}

}

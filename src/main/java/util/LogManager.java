package util;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogManager {
	private static boolean root = false;

	public static Logger getLogger(Class clas){
		if (root) {
			return Logger.getLogger(clas);
		}
		// Get log4j property file path
		String log4jLocation = System.getProperty("user.dir")+"/src/main/resources/log4j.properties";
		
		PropertyConfigurator.configure(log4jLocation);
		root = true;
		return Logger.getLogger(clas);
	}
}

package com.ttn.CommonUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ttn.Builder.BaseLib;

public class PropertyReader {
	protected static Logger logger = LoggerFactory.getLogger(PropertyReader.class);
	public static String path;
	public static String Environment = PropertyReader.getProperty_for_baseconfig("Environment");

	public static String getProperty(String propertyName) {

		if (Environment.equalsIgnoreCase("UAT")) {
			path = "/src/test/resources/DataSet_UAT.properties";
		} else if (Environment.equalsIgnoreCase("Stage")) {
			path = "/src/test/resources/DataSet_Stage.properties";
		} else if (Environment.equalsIgnoreCase("prod")) {
			path = "/src/test/resources/DataSet_Prod.properties";
		}

		FileReader reader = null;
		try {
			reader = new FileReader(ResourceHelper.getResourcePath(path));
			Properties p = new Properties();
			p.load(reader);
			propertyName = p.getProperty(propertyName);
		} catch (FileNotFoundException e) {
			logger.info("Properties file not found at given path.");
		} catch (IOException e) {
			logger.info("Exception occoured");
		} finally {
			if (reader != null) {
				try {

					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return propertyName;
	}

	public static String getProperty_for_baseconfig(String propertyName) {

		FileReader reader = null;
		try {
			if (propertyName.equalsIgnoreCase("testURL")) {
				String env = BaseLib.globalEnvironment;
				if (env.equalsIgnoreCase("UAT")) {
					reader = new FileReader(ResourceHelper.getResourcePath("/src/test/resources/config.properties"));
					Properties p = new Properties();
					p.load(reader);
					propertyName = p.getProperty("UAT_Base_Url");
				} else if (env.equalsIgnoreCase("prod")) {
					reader = new FileReader(ResourceHelper.getResourcePath("/src/test/resources/config.properties"));
					Properties p = new Properties();
					p.load(reader);
					propertyName = p.getProperty("Prod_Base_Url");
				} else if (env.equalsIgnoreCase("Stage")) {
					reader = new FileReader(ResourceHelper.getResourcePath("/src/test/resources/config.properties"));
					Properties p = new Properties();
					p.load(reader);
					propertyName = p.getProperty("Stage_Base_Url");
				}

			}

			else if (propertyName.equalsIgnoreCase("Environment")) {
				propertyName = BaseLib.globalEnvironment;
			} else {
				reader = new FileReader(ResourceHelper.getResourcePath("/src/test/resources/config.properties"));
				Properties p = new Properties();
				p.load(reader);
				propertyName = p.getProperty(propertyName);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found at given path.");

		} catch (IOException e) {

		} finally {
			if (reader != null) {
				try {

					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return propertyName;
	}

	/**
	 *
	 * 
	 * @author TTN
	 * @param propertyName filePathofPropertyfile
	 */

	public static String getProperty_for_baseconfig(String propertyName, String filePathofPropertyfile) {

		FileReader reader = null;
		try {
			if (propertyName.equalsIgnoreCase("Environment")) {
				propertyName = BaseLib.globalEnvironment;
			} else {
				reader = new FileReader(ResourceHelper.getResourcePath(filePathofPropertyfile));
				Properties p = new Properties();
				p.load(reader);
				propertyName = p.getProperty(propertyName);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found at given path.");

		} catch (IOException e) {

		} finally {
			if (reader != null) {
				try {

					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return propertyName;
	}

}

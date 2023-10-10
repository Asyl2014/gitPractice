package com.difital.driver;

import com.difital.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){
        // Singelton patern

    }
private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxDriver();
                    break;

                default:
                    throw new IllegalArgumentException("You provide wrong Driver name");

            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver=null;

            }

        }catch (Exception e){
            System.out.println("Error while closing the driver");
        }
    }
}

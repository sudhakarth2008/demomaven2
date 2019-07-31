package Sudharani;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;

public class Mercury {
	
	 public static String baseUrl = "http://www.newtours.demoaut.com/";
	 public  static String  driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
     public static WebDriver driver ; 
     
     
     @Test
     public static void Allmethods()throws Exception
     {
    	 Mercury.openBrowser();
    	 Mercury.Login();
    	 Mercury.CloseBrowser();
     }
     
     public static void openBrowser()throws Exception
     {
    	 
     	 ChromeOptions options = new ChromeOptions();
    	 options.addArguments("--disable-notifications");
    	 System.setProperty("webdriver.chrome.driver",driverPath);
    	 driver =new ChromeDriver(options);
    	 driver.get(baseUrl);
     	 driver.manage().window().maximize() ;
    	 
     }
     
     public static void Login()throws Exception
     {
    	 

    	 driver.findElement(By.xpath("  //input[@type='text' and @name='userName']  ")).sendKeys("mercury");
    	 driver.findElement(By.xpath(" //input[@type='password'][@name='password']    ")).sendKeys("mercury");
    	 driver.findElement(By.xpath("  //*[@name='login']   ")).click();
    	 
     }
     
     public static void CloseBrowser()throws Exception
     {
    		driver.quit();
     }
     
   
     
}


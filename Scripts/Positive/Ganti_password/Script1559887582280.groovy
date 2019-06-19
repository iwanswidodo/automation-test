import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

System.setProperty("webdriver.gecko.driver","D:\\Investasi Kita\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://192.168.2.200:8083");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
Thread.sleep(5000);
driver.findElement(By.id("login-email")).sendKeys("testiwan123@gmail.com");
driver.findElement(By.id("login-password")).sendKeys("Iwan1234");
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@id='userMenu']/img")).click();
driver.findElement(By.xpath("(//a[contains(text(),'Ganti Password')])[2]")).click();
driver.findElement(By.xpath("//input[@id='currentPassword']")).sendKeys("Iwan1234");
Thread.sleep(5000);
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::span[1]")).click();
driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Iwan12345");
driver.findElement(By.xpath("//input[@id='confirmNewPassword']")).sendKeys("Iwan12345");
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
driver.findElement(By.xpath("//section/div/button/span")).click();
driver.findElement(By.xpath("//button[@id='userMenu']/img")).click();
Thread.sleep(5000);
driver.navigate().to("http://192.168.2.200:8083/#/logout");

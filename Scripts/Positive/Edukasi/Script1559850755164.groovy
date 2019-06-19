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
Thread.sleep(20000);
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::span[1]")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//a[contains(text(),'Edukasi')]")).click();
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
Thread.sleep(10000);
WebElement expandandcolapse1 = driver.findElement(By.xpath("//button[@type='button']"));
for (int i = 0; i < 1; i++) {
	expandandcolapse1.click();
	System.out.println(expandandcolapse1.isSelected());
}
WebElement expandandcolapse2 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
for (int i = 0; i < 1; i++) {
	expandandcolapse2.click();
	System.out.println(expandandcolapse2.isSelected());
}
WebElement expandandcolapse3 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
for (int i = 0; i < 1; i++) {
	expandandcolapse3.click();
	System.out.println(expandandcolapse3.isSelected());
}
WebElement expandandcolapse4 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
for (int i = 0; i < 1; i++) {
	expandandcolapse4.click();
	System.out.println(expandandcolapse4.isSelected());
}
WebElement expandandcolapse5 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
for (int i = 0; i < 2; i++) {
	expandandcolapse5.click();
	System.out.println(expandandcolapse5.isSelected());
}
WebElement expandandcolapse60 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
for (int i = 0; i < 2; i++) {
	expandandcolapse60.click();
	System.out.println(expandandcolapse60.isSelected());
}
WebElement expandandcolapse61 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
for (int i = 0; i < 2; i++) {
	expandandcolapse61.click();
	System.out.println(expandandcolapse61.isSelected());
}
WebElement expandandcolapse62 = driver.findElement(By.xpath("(//button[@type='button'])"));
for (int i = 0; i < 2; i++) {
	expandandcolapse62.click();
	System.out.println(expandandcolapse62.isSelected());
}




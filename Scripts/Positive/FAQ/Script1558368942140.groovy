import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

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
//		driver.findElement(By.cssSelector("#path-faq > a")).click();
//		WebElement elemen = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::span[1]"));
//		elemen.isSelected();
		Thread.sleep(20000);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::span[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'FAQ')]")).click();
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
		WebElement expandandcolapse5 = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse5.click();
			System.out.println(expandandcolapse5.isSelected());
		}
		WebElement expandandcolapse6 = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse6.click();
			System.out.println(expandandcolapse6.isSelected());
		}
		WebElement expandandcolapse7 = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse7.click();
			System.out.println(expandandcolapse7.isSelected());
		}
		WebElement expandandcolapse8 = driver.findElement(By.xpath("(//button[@type='button'])[8]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse8.click();
			System.out.println(expandandcolapse8.isSelected());
		}
		WebElement expandandcolapse9 = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse9.click();
			System.out.println(expandandcolapse9.isSelected());
		}
		WebElement expandandcolapse10 = driver.findElement(By.xpath("(//button[@type='button'])[10]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse10.click();
			System.out.println(expandandcolapse10.isSelected());
		}
		WebElement expandandcolapse11 = driver.findElement(By.xpath("(//button[@type='button'])[11]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse11.click();
			System.out.println(expandandcolapse11.isSelected());
		}
		WebElement expandandcolapse12 = driver.findElement(By.xpath("(//button[@type='button'])[12]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse12.click();
			System.out.println(expandandcolapse12.isSelected());
		}
		WebElement expandandcolapse13 = driver.findElement(By.xpath("(//button[@type='button'])[13]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse13.click();
			System.out.println(expandandcolapse13.isSelected());
		}
		WebElement expandandcolapse14 = driver.findElement(By.xpath("(//button[@type='button'])[14]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse14.click();
			System.out.println(expandandcolapse14.isSelected());
		}
		WebElement expandandcolapse15 = driver.findElement(By.xpath("(//button[@type='button'])[15]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse15.click();
			System.out.println(expandandcolapse15.isSelected());
		}
		WebElement expandandcolapse16 = driver.findElement(By.xpath("(//button[@type='button'])[16]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse16.click();
			System.out.println(expandandcolapse16.isSelected());
		}
		WebElement expandandcolapse17 = driver.findElement(By.xpath("(//button[@type='button'])[17]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse17.click();
			System.out.println(expandandcolapse17.isSelected());
		}
		WebElement expandandcolapse18 = driver.findElement(By.xpath("(//button[@type='button'])[18]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse18.click();
			System.out.println(expandandcolapse18.isSelected());
		}
		WebElement expandandcolapse19 = driver.findElement(By.xpath("(//button[@type='button'])[19]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse19.click();
			System.out.println(expandandcolapse19.isSelected());
		}
		WebElement expandandcolapse20 = driver.findElement(By.xpath("(//button[@type='button'])[20]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse20.click();
			System.out.println(expandandcolapse20.isSelected());
		}
		WebElement expandandcolapse21 = driver.findElement(By.xpath("(//button[@type='button'])[21]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse21.click();
			System.out.println(expandandcolapse21.isSelected());
		}
		WebElement expandandcolapse22 = driver.findElement(By.xpath("(//button[@type='button'])[22]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse22.click();
			System.out.println(expandandcolapse22.isSelected());
		}
		WebElement expandandcolapse23 = driver.findElement(By.xpath("(//button[@type='button'])[23]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse23.click();
			System.out.println(expandandcolapse23.isSelected());
		}
		WebElement expandandcolapse24 = driver.findElement(By.xpath("(//button[@type='button'])[24]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse24.click();
			System.out.println(expandandcolapse24.isSelected());
		}
		WebElement expandandcolapse25 = driver.findElement(By.xpath("(//button[@type='button'])[25]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse25.click();
			System.out.println(expandandcolapse25.isSelected());
		}
		WebElement expandandcolapse26 = driver.findElement(By.xpath("(//button[@type='button'])[26]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse26.click();
			System.out.println(expandandcolapse26.isSelected());
		}
		WebElement expandandcolapse27 = driver.findElement(By.xpath("(//button[@type='button'])[27]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse27.click();
			System.out.println(expandandcolapse27.isSelected());
		}
		WebElement expandandcolapse28 = driver.findElement(By.xpath("(//button[@type='button'])[28]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse28.click();
			System.out.println(expandandcolapse28.isSelected());
		}
		WebElement expandandcolapse29 = driver.findElement(By.xpath("(//button[@type='button'])[29]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse29.click();
			System.out.println(expandandcolapse29.isSelected());
		}
		WebElement expandandcolapse30 = driver.findElement(By.xpath("(//button[@type='button'])[30]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse30.click();
			System.out.println(expandandcolapse30.isSelected());
		}
		WebElement expandandcolapse31 = driver.findElement(By.xpath("(//button[@type='button'])[31]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse31.click();
			System.out.println(expandandcolapse31.isSelected());
		}
		WebElement expandandcolapse32 = driver.findElement(By.xpath("(//button[@type='button'])[31]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse32.click();
			System.out.println(expandandcolapse32.isSelected());
		}
		WebElement expandandcolapse33 = driver.findElement(By.xpath("(//button[@type='button'])[30]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse33.click();
			System.out.println(expandandcolapse33.isSelected());
		}
		WebElement expandandcolapse34 = driver.findElement(By.xpath("(//button[@type='button'])[29]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse34.click();
			System.out.println(expandandcolapse34.isSelected());
		}
		WebElement expandandcolapse35 = driver.findElement(By.xpath("(//button[@type='button'])[28]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse35.click();
			System.out.println(expandandcolapse35.isSelected());
		}
		WebElement expandandcolapse36 = driver.findElement(By.xpath("(//button[@type='button'])[27]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse36.click();
			System.out.println(expandandcolapse36.isSelected());
		}
		WebElement expandandcolapse37 = driver.findElement(By.xpath("(//button[@type='button'])[26]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse37.click();
			System.out.println(expandandcolapse37.isSelected());
		}
		WebElement expandandcolapse38 = driver.findElement(By.xpath("(//button[@type='button'])[25]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse38.click();
			System.out.println(expandandcolapse38.isSelected());
		}
		WebElement expandandcolapse39 = driver.findElement(By.xpath("(//button[@type='button'])[24]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse39.click();
			System.out.println(expandandcolapse39.isSelected());
		}
		WebElement expandandcolapse40 = driver.findElement(By.xpath("(//button[@type='button'])[23]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse40.click();
			System.out.println(expandandcolapse40.isSelected());
		}
		WebElement expandandcolapse41 = driver.findElement(By.xpath("(//button[@type='button'])[22]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse41.click();
			System.out.println(expandandcolapse41.isSelected());
		}
		WebElement expandandcolapse42 = driver.findElement(By.xpath("(//button[@type='button'])[21]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse42.click();
			System.out.println(expandandcolapse42.isSelected());
		}
		WebElement expandandcolapse43 = driver.findElement(By.xpath("(//button[@type='button'])[20]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse43.click();
			System.out.println(expandandcolapse43.isSelected());
		}
		WebElement expandandcolapse44 = driver.findElement(By.xpath("(//button[@type='button'])[19]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse44.click();
			System.out.println(expandandcolapse44.isSelected());
		}
		WebElement expandandcolapse45 = driver.findElement(By.xpath("(//button[@type='button'])[18]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse45.click();
			System.out.println(expandandcolapse45.isSelected());
		}
		WebElement expandandcolapse46 = driver.findElement(By.xpath("(//button[@type='button'])[17]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse46.click();
			System.out.println(expandandcolapse46.isSelected());
		}
		WebElement expandandcolapse47 = driver.findElement(By.xpath("(//button[@type='button'])[16]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse47.click();
			System.out.println(expandandcolapse47.isSelected());
		}
		WebElement expandandcolapse48 = driver.findElement(By.xpath("(//button[@type='button'])[15]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse48.click();
			System.out.println(expandandcolapse48.isSelected());
		}
		WebElement expandandcolapse49 = driver.findElement(By.xpath("(//button[@type='button'])[14]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse49.click();
			System.out.println(expandandcolapse49.isSelected());
		}
		WebElement expandandcolapse50 = driver.findElement(By.xpath("(//button[@type='button'])[13]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse50.click();
			System.out.println(expandandcolapse50.isSelected());
		}
		WebElement expandandcolapse51 = driver.findElement(By.xpath("(//button[@type='button'])[12]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse51.click();
			System.out.println(expandandcolapse51.isSelected());
		}
		WebElement expandandcolapse52 = driver.findElement(By.xpath("(//button[@type='button'])[11]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse52.click();
			System.out.println(expandandcolapse52.isSelected());
		}
		WebElement expandandcolapse53 = driver.findElement(By.xpath("(//button[@type='button'])[10]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse53.click();
			System.out.println(expandandcolapse53.isSelected());
		}
		WebElement expandandcolapse54 = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse54.click();
			System.out.println(expandandcolapse54.isSelected());
		}
		WebElement expandandcolapse55 = driver.findElement(By.xpath("(//button[@type='button'])[8]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse55.click();
			System.out.println(expandandcolapse55.isSelected());
		}
		WebElement expandandcolapse56 = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse56.click();
			System.out.println(expandandcolapse56.isSelected());
		}
		WebElement expandandcolapse57 = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse57.click();
			System.out.println(expandandcolapse57.isSelected());
		}
		WebElement expandandcolapse58 = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse58.click();
			System.out.println(expandandcolapse58.isSelected());
		}
		WebElement expandandcolapse59 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse59.click();
			System.out.println(expandandcolapse59.isSelected());
		}
		WebElement expandandcolapse60 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse60.click();
			System.out.println(expandandcolapse60.isSelected());
		}
		WebElement expandandcolapse61 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse61.click();
			System.out.println(expandandcolapse61.isSelected());
		}
		WebElement expandandcolapse62 = driver.findElement(By.xpath("(//button[@type='button'])"));
		for (int i = 0; i < 1; i++) {
			expandandcolapse62.click();
			System.out.println(expandandcolapse62.isSelected());
		}
		
//		WebElement expandandcolapse6 = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
//		for (int i = 0; i < 1; i++) {
//			expandandcolapse6.click();
//			System.out.println(expandandcolapse6.isSelected());
//		}

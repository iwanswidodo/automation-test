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
import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

		System.setProperty("webdriver.gecko.driver","D:\\Investasi Kita\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://192.168.2.200:8083");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-email")).sendKeys("testiwan123@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Iwan12345");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='path-product']/a")).click();		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::span[1]")).click();
		Thread.sleep(5000);	
		driver.findElement(By.linkText("Semua Produk")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Risiko Sangat Tinggi'])[5]/following::a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jumlah Pembelian (Rp.)'])[1]/following::span[1]")).click();
		driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label")).click();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
//		System.out.println("1");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Berhasil Ditambahkan'])[1]/following::span[1]")).click();
//		System.out.println("2");
//		driver.findElement(By.xpath("")).click();
		Thread.sleep(7000);
		
		WebElement element1 = driver.findElement(By.linkText("Semua Produk"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		for (int i = 0; i < 1; i++) {
			element1.click();
			System.out.println(element1.isSelected());
		}
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Risiko Sedang'])[6]/following::a[1]")).click();
		Thread.sleep(5000);
		WebElement element2 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jumlah Pembelian (Rp.)'])[1]/following::span[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		for (int j = 0; j < 1; j++) {
			element2.click();
			System.out.println(element2.isSelected());
		}
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("")).click();
		WebElement element3 = driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		for (int k = 0; k < 1; k++) {
			element3.click();
			System.out.println(element3.isSelected());
		}
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
//		System.out.println("1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Berhasil Ditambahkan'])[1]/following::span[1]")).click();
		
//		System.out.println("2");
//		driver.findElement(By.xpath("")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//div[@id='root']/div/header[2]/div/div/div[5]/a/img")).click();
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
		driver.findElement(By.xpath("//div[@id='root']/div[2]/section/div[2]/div/div[2]/button")).click();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='headingOne']/div/label)[3]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
		driver.findElement(By.xpath("//div[@id='root']/div[2]/section[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='userMenu']/img")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Portfolio'])[1]/following::a[1]")).click();
		Thread.sleep(5000);
//				WebElement buttonkembalikeberanda = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riwayat Transaksi'])[3]/following::a[1]"));
//				for (int i = 0; i < 1; i++) {
//					buttonkembalikeberanda.click();
//					System.out.println(buttonkembalikeberanda.isSelected());
//				}
//				driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riwayat Transaksi'])[3]/following::a[1]"));
		Thread.sleep(5000);
		driver.navigate().to("http://192.168.2.200:8083/#/logout");
//				WebElement iconext = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riwayat Transaksi'])[3]/following::a[1]"));
//				iconext.click();
//				driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dashboard'])[2]/preceding::img[1]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//div[@id='root']/div/header[2]/div/div/div/div/div/a[7]")).click();
//				Thread.sleep(2000);
		
//		System.out.println("3");
//		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//		System.out.println("4");
//		driver.findElement(By.xpath("(//div[@id='headingOne']/div/label)[4]")).click();
//		System.out.println("5");
	
	

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
driver.findElement(By.xpath("//li[@id='path-product']/a")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::span[1]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@id='product-content']/div/div/section/div/div/div/div[2]/div[5]/a")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id='trx-order-totalAmount']")).sendKeys("1000000");
driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label")).click();
driver.findElement(By.xpath("//button[@type='button']")).click();
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Berhasil Ditambahkan'])[1]/following::button[2]")).click();
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
WebElement element= driver.findElement(By.xpath("(//a[contains(text(),'Beli')])[2]"));
WebDriverWait wait = new WebDriverWait(driver, 20); //here, wait time is 20 seconds
wait.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
element.click();
driver.findElement(By.xpath("//input[@id='trx-order-totalAmount']")).sendKeys("1000000");
Thread.sleep(5000);
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
//driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label"));
WebElement chkTermcond = driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label"));
for (int i = 0; i < 1; i++) {
	chkTermcond.click();
	System.out.println(chkTermcond.isSelected());
}
//		WebElement elem= driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label"));
//		WebDriverWait wait1 = new WebDriverWait(driver, 20); //here, wait time is 20 seconds
//		wait.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
//		element.click();
//		driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@type='button']")).click();
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Berhasil Ditambahkan'])[1]/following::button[2]")).click();
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
//		WebElement buttonkembalikeberanda = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riwayat Transaksi'])[3]/following::a[1]"));
//		for (int i = 0; i < 1; i++) {
//			buttonkembalikeberanda.click();
//			System.out.println(buttonkembalikeberanda.isSelected());
//		}
//		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riwayat Transaksi'])[3]/following::a[1]"));
Thread.sleep(5000);
driver.navigate().to("http://192.168.2.200:8083/#/logout");

//		WebElement iconext = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riwayat Transaksi'])[3]/following::a[1]"));
//		iconext.click();
//		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dashboard'])[2]/preceding::img[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='root']/div/header[2]/div/div/div/div/div/a[7]")).click();
//		Thread.sleep(2000);


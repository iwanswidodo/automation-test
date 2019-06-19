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
Thread.sleep(5000);
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::span[1]")).click();
Thread.sleep(5000);
driver.findElement(By.linkText("Semua Produk")).click();
Thread.sleep(5000);
WebElement chkPasarUang = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hapus'])[1]/following::label[1]"));
for (int i = 0; i < 1; i++) {
	chkPasarUang.click();
	System.out.println(chkPasarUang.isSelected());
}

//		WebElement chkPendapatanTetap = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pasar Uang'])[1]/following::label[1]"));
//		for (int i = 0; i < 1; i++) {
//		chkPendapatanTetap.click();
//		System.out.println(chkPendapatanTetap.isSelected());
//		}

//		WebElement chkCampuran = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pendapatan Tetap'])[1]/following::label[1]"));
//		for (int i = 0; i < 1; i++) {
//		chkCampuran.click();
//		System.out.println(chkCampuran.isSelected());
//		}


//		WebElement chkIndex = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Campuran'])[1]/following::label[1]"));
//		for (int i = 0; i < 1; i++) {
//		chkIndex.click();
//		System.out.println(chkIndex.isSelected());
//		}

//		WebElement chkSaham = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Index'])[1]/following::label[1]"));
//		for (int i = 0; i < 1; i++) {
//		chkSaham.click();
//		System.out.println(chkSaham.isSelected());
//		}


//		WebElement chkkonvensional = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Saham'])[1]/following::label[1]"));
//		for (int i = 0; i < 1; i++) {
//		chkkonvensional.click();
//		System.out.println(chkkonvensional.isSelected());
//		}

WebElement chkSyariah = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Konvensional'])[1]/following::label[1]"));
for (int i = 0; i < 1; i++) {
	chkSyariah.click();
System.out.println(chkSyariah.isSelected());
}

//		WebElement chkUSD = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Syariah'])[1]/following::label[1]"));
//		for (int i = 0; i < 1; i++) {
//			chkUSD.click();
//		System.out.println(chkUSD.isSelected());
//		}
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='USD'])[1]/following::button[1]")).click();

driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Risiko Rendah'])[4]/following::a[1]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jumlah Pembelian (Rp.)'])[1]/following::span[1]")).click();
//		WebElement element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jumlah Pembelian ($)'])[1]/following::span[1]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label")).click();
//		WebElement element2 = driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/div[2]/div/label"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
Thread.sleep(5000);

//
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='keterangan ringkas'])[1]/following::button[1]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bank BNI'])[1]/following::label[1]")).click();
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
Thread.sleep(3000);
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
Thread.sleep(3000);
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Segera transfer dana sejumlah total pembelian ke rekening reksa dana berikut:'])[1]/following::a[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Keluar'])[1]/following::img[3]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@id='userMenu']/img")).click();
//		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dashboard'])[2]/following::a[2]")).click();
//		WebElement element= driver.findElement(By.xpath("(//a[contains(text(),'Riwayat Transaksi')])[2]"));
//		WebDriverWait wait = new WebDriverWait(driver, 20); //here, wait time is 20 seconds
//		wait.until(ExpectedConditions.visibilityOf(element)); //this will wait for elememt to be visible for 20 seconds
//		element.click();
//		WebElement riwayattransaksi = driver.findElement(By.xpath("(//a[contains(text(),'Riwayat Transaksi')])[2]"));
//		riwayattransaksi.click();
WebElement element1 = driver.findElement(By.xpath("(//a[contains(text(),'Riwayat Transaksi')])[2]"));
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
Thread.sleep(5000);
driver.navigate().to("http://192.168.2.200:8083/#/logout");
		
		
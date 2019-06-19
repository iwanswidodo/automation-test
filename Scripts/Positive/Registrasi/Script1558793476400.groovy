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
import org.openqa.selenium.support.ui.Select;

		//jika pakai browser google chrome
//		System.setProperty("webdriver.chrome.driver","D:\\Investasi Kita\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		jika pakai browser firefox
System.setProperty("webdriver.gecko.driver","D:\\Investasi Kita\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://192.168.2.200:8083");
driver.manage().window().maximize();
//		driver.findElement(By.id("identifierId")).sendKeys("iwanf2509@gmail.com");
//		driver.findElement(By.className("CwaK9")).click();
driver.findElement(By.xpath("//div[@id='root']/div/header[2]/div/div/div/div/a")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@id='root']/div/div[2]/p/a")).click();
driver.findElement(By.id("login-email")).sendKeys(email);
driver.findElement(By.id("login-email-verification")).sendKeys(tulis_ulang_email);
driver.findElement(By.id("login-password")).sendKeys(password);
driver.findElement(By.id("login-password-verification")).sendKeys(tulis_ulang_password);
driver.findElement(By.id("login-no")).sendKeys(nomor_ponsel);
driver.findElement(By.id("login-no-verification")).sendKeys(tulis_ulang_nomor_ponsel);
driver.findElement(By.id("login-identity")).sendKeys(nama_sesuai_identitas);;
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
WebElement elem = driver.findElement(By.name("imageIdentityTemp"));
elem.sendKeys("D:\\Investasi Kita\\KTP.jpg");
WebElement elem1 = driver.findElement(By.name("imageSelfieTemp"));
elem1.sendKeys("D:\\Investasi Kita\\KTP.jpg");
((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
driver.findElement(By.id("login-code")).sendKeys(darimana_anda_mengenal_kita);

//data lainnya / opsional

driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section[2]/h3/img")).click();
Select drpeducation = new Select(driver.findElement(By.name("education")));
drpeducation.selectByValue("PRIMARY_SCHOOL");
Select drpincome = new Select(driver.findElement(By.name("income")));
drpincome.selectByValue("GT_10_LE_50_MILLION_PER_YEAR");
Select drpSOF = new Select(driver.findElement(By.name("sourceFund")));
drpSOF.selectByValue("BUSINESS_PROFIT");
Select drpinvestmentObjective = new Select(driver.findElement(By.name("investmentObjective")));
drpinvestmentObjective.selectByValue("GAIN_FROM_PRICE_MARGIN");
			
WebElement chkgrncrd = driver.findElement(By.xpath("//div[@id='data-lainnya']/div[5]/label"));
for (int i = 0; i < 1; i++) {
	chkgrncrd.click();
	System.out.println(chkgrncrd.isSelected());
}

WebElement option2 = driver.findElement(By.xpath("//div[@id='headingTwo']/div/label"));
option2.click();
if (option2.isSelected()) {
	driver.findElement(By.id("middle-risk-toggler")).click();
	System.out.println("checkbox toggle on");
}else {
	
	System.out.println("checkbox toggle off");
}

Thread.sleep(6000);



WebElement option3 = driver.findElement(By.xpath("//div[@id='headingThree']/div/label"));
option3.click();
if (option3.isSelected()) {
	driver.findElement(By.id("high-risk-toggler")).click();
	System.out.println("checkbox toggle on");
}else {
	
	System.out.println("checkbox toggle off");
}

Thread.sleep(6000);

WebElement option1 = driver.findElement(By.xpath("//div[@id='headingOne']/div/label"));
option1.click();
if (option1.isSelected()) {
	driver.findElement(By.id("low-risk-toggler")).click();
	System.out.println("checkbox toggle on");
}else {
	
	System.out.println("checkbox toggle off");
}

Thread.sleep(6000);

driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//		driver.findElement(By.linkText("Reset Form")).click();

//next step 2

driver.findElement(By.id("react-select-4-input")).sendKeys(masukkan_bank);
driver.findElement(By.id("login-bank-rupiah-cabang")).sendKeys(cabang);
driver.findElement(By.id("login-bank-rupiah-rekening")).sendKeys(nomor_rekening);
driver.findElement(By.id("login-bank-rupiah-akun")).sendKeys(nama_nasabah);
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//driver.findElement(By.xpath("//a[contains(text(),'Sebelumnya')]")).click();

//next step 3

WebElement element = driver.findElement(By.className("signature")); // where your canvas element is

	Actions builder = new Actions(driver);
	Action drawAction = builder.moveToElement(element,50,50)  // start point
				 .click()
				 .moveByOffset(100, 60) // second point
				 .doubleClick()
				 .build();
	   drawAction.perform();


//term and condition
WebElement chkTermcond = driver.findElement(By.xpath("//div[@id='root']/div[2]/form/section/div[2]/div/label"));
for (int i = 0; i < 1; i++) {
	chkTermcond.click();
	System.out.println(chkTermcond.isSelected());
}

driver.findElement(By.id("signature-save")).click();
//driver.findElement(By.xpath("//a[contains(text(),'Sebelumnya')]")).click();
//WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/button_Kirim Data'))

//WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/a_Kembali ke Beranda'))


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
import org.openqa.selenium.support.ui.Select;

//		System.setProperty("webdriver.gecko.driver","D:\\Investasi Kita\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://192.168.2.200:8083");
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-email")).sendKeys("testiwan123@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Iwan12345");
//		driver.findElement(By.id("//div[@id='root']/div/form/div[3]/div/div/label")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Keluar'])[1]/following::img[3]")).click();
		System.out.println("A");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Riwayat Transaksi'])[2]/following::a[1]")).click();
		System.out.println("B");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::span[1]")).click();
		System.out.println("C");
		Thread.sleep(5000);	
//		driver.findElement(By.xpath("")).click();
//		
		WebElement element2 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Keluar'])[2]/following::a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		element2.click();
		System.out.println("D");
		WebElement element3 = driver.findElement(By.id("nationality"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
		element3.clear();
		element3.sendKeys("SWISS");
		driver.findElement(By.id("identityNo")).clear();
		driver.findElement(By.id("identityNo")).sendKeys("357203250993002");
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("PRIA");
		Select religion = new Select(driver.findElement(By.id("religion")));
		religion.selectByVisibleText("HINDUISM");
		Select education = new Select(driver.findElement(By.id("education")));
		education.selectByVisibleText("DIPLOMA");
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("JALAN CATUR TUNGGAL NO.51E");
		Select regency  = new Select(driver.findElement(By.id("regency")));
		regency.selectByVisibleText("KOTA BLITAR");
		Select province  = new Select(driver.findElement(By.id("province")));
		province.selectByVisibleText("JAWA TIMUR");
		Select country  = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("INDONESIA");
		Select income  = new Select(driver.findElement(By.id("income")));
		income.selectByVisibleText("> Rp 50 - Rp 100 JUTA/TAHUN");
		Select individusourceFund  = new Select(driver.findElement(By.id("individu-sourceFund")));
		individusourceFund.selectByVisibleText("WARISAN");
		Select individuinvestmentObjective  = new Select(driver.findElement(By.id("individu-investmentObjective")));
		individuinvestmentObjective.selectByVisibleText("SPEKULASI");
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
		
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Risiko Tinggi'])[1]/following::button[2]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Risiko Tinggi'])[1]/following::span[1]"));
		driver.navigate().to("http://192.168.2.200:8083/#/logout");
		
		System.out.println("active dscript");
		
		
		
		

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




WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.2.200:8083/#/')

WebUI.click(findTestObject('Object Repository/Pengaturan/a_Login'))

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Pengaturan/input__username'), 'testiwan123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Pengaturan/input_Email_password'), 'XQtRbu5+2fLe28lnuJl9Fg==')

WebUI.click(findTestObject('Object Repository/Pengaturan/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Pengaturan/button_Masuk'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Pengaturan/span_'))

WebUI.click(findTestObject('Object Repository/Pengaturan/img_Keluar_btn-icon'))

WebUI.click(findTestObject('Object Repository/Pengaturan/a_Pengaturan'))

//WebElement chkPromo = driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div[2]/form/section[2]/div/label"));
//for (int i = 0; i < 1; i++) {
//	chkPromo.click();
//	System.out.println(chkPromo.isSelected());
//}
//WebElement chkEvent = driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div[2]/form/section[2]/div/label"));
//for (int i = 0; i < 1; i++) {
//	chkEvent.click();
//	System.out.println(chkEvent.isSelected());
//}

WebUI.click(findTestObject('Object Repository/Pengaturan/label_Promo'))

WebUI.click(findTestObject('Object Repository/Pengaturan/label_Event'))

WebUI.click(findTestObject('Object Repository/Pengaturan/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Pengaturan/a_Keluar'))

WebUI.closeBrowser()


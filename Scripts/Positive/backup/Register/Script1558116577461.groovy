import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.2.200:8083/#/')

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/a_Login'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/a_Daftar'))

WebUI.delay(6)

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/input_Informasi Pribadi_email'), 
    'iwan.widodo@indocyber.co.id')

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/input_Email_confirmEmail'), 
    'iwan.widodo@indocyber.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/input_Tulis ulang email_password'), 
    'XQtRbu5+2fKt9RduZ46SEA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/confirmPassword'), 
    'XQtRbu5+2fKt9RduZ46SEA==')

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/tulis ulang kata sandi'), 
    'IWAN SURYO WIDODO')

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/input_Indonesia_mobileNumber'), 
    '85736666637')

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/confirmPhoneNumber'), '85736666637')

WebUI.scrollToPosition(0, 600)

WebUI.uploadFile(findTestObject('imageSelfieTemp'), "D:\\Investasi Kita\\KTP.jpg")

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/darimana kamu tahu'), 'web')

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/button_Selanjutnya'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/div_Cari nama bank'))

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/input_Akun Bank'), 'bank bca')

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/div_BANK BCA'))

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/input_Nama Bank_branch'), 
    'jakarta timur')

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/input_Bank Country_accountNo'), 
    '5455051107')

WebUI.setText(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/input_Currency_accountName'), 
    'IWAN SURYO WIDODO')

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/button_Selanjutnya'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/Tanda Tangan Elektronik'))

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/Saya setuju'))

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/button_Kirim Data'))

WebUI.click(findTestObject('Object Repository/Register/Page_InvestasiKita/Page_InvestasiKita/a_Kembali ke Beranda'))

WebUI.closeBrowser()


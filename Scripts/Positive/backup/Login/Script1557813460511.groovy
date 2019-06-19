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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.2.200:8083/#/')

WebUI.click(findTestObject('a_Login (1)'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Login(Positve)/input__username'), Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Login(Positve)/input_Email_password'), a)

WebUI.click(findTestObject('Object Repository/Login(Positve)/button_Masuk'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Login(Positve)/button_Keluar_userMenu'))

WebUI.click(findTestObject('Object Repository/Login(Positve)/img_Keluar_btn-icon'))

WebUI.click(findTestObject('Object Repository/Login(Positve)/a_Keluar'))

WebUI.closeBrowser()


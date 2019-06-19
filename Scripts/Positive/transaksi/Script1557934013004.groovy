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

WebUI.click(findTestObject('Object Repository/transaksi/a_Login'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/transaksi/input__username'), 'testiwan123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/transaksi/input_Email_password'), 'XQtRbu5+2fKt9RduZ46SEA==')

WebUI.click(findTestObject('Object Repository/transaksi/button_Masuk'))

WebUI.click(findTestObject('Object Repository/transaksi/a_Produk'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/transaksi/a_Beli'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/transaksi/input_Beli Reksa Dana_totalAmount'), '150.000')

WebUI.click(findTestObject('Object Repository/transaksi/label_Saya telah membaca dan menyetujui seluruh isi Prospektus  dan keterangan ringkas'))

WebUI.click(findTestObject('Object Repository/transaksi/button_Bayar'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/transaksi/div_Bank Mandiri'))

WebUI.click(findTestObject('Object Repository/transaksi/button_Bayar'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/transaksi/a_Kembali ke Beranda'))

WebUI.closeBrowser()


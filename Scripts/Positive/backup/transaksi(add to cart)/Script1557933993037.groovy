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

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Login'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/transaksi(add to cart)/input__username'), 'testiwan123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/transaksi(add to cart)/input_Email_password'), 'XQtRbu5+2fKt9RduZ46SEA==')

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Masuk'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Produk'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/span_'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Beli'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/transaksi(add to cart)/input_Beli Reksa Dana_totalAmount'), '1.000.000')

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/label_Saya telah membaca dan menyetujui seluruh isi Prospektus  dan keterangan ringkas'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Tambahkan ke Keranjang'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Tutup'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Beli_1'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/transaksi(add to cart)/input_Beli Reksa Dana_totalAmount'), '1.000.000')

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/label_Saya telah membaca dan menyetujui seluruh isi Prospektus  dan keterangan ringkas'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Tambahkan ke Keranjang'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/span__1'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/img'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('transaksi(add to cart)/button_Bayar_1 (1)'))

not_run: WebUI.scrollToPosition(0, 600)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Bayar_1'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Kembali ke Beranda'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/img_Keluar_btn-icon'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Keluar'))


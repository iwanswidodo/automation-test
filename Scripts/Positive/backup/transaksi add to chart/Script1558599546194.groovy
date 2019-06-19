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

WebUI.navigateToUrl('http://192.168.2.200:8083/#/')

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Login (1)'))

WebUI.setText(findTestObject('Object Repository/transaksi(add to cart)/input_Gagal Masuk_username'), 'testiwan123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/transaksi(add to cart)/input_Email_password (1)'), 'XQtRbu5+2fKt9RduZ46SEA==')

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Masuk (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/span_ (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Produk (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Beli (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/span_1juta'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/img_Ketentuan Penting_title-sign'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/label_Saya telah membaca dan menyetujui seluruh isi Prospektus  dan keterangan ringkas (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Tambahkan ke Keranjang (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Tutup (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/a_Beli_2'))

WebUI.setText(findTestObject('Object Repository/transaksi(add to cart)/input_Beli Reksa Dana_totalAmount (1)'), '1.500.000')

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/label_Saya telah membaca dan menyetujui seluruh isi Prospektus  dan keterangan ringkas (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Tambahkan ke Keranjang (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Tutup (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/img (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Bayar_1 (1)'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/label_Bank BRI'))

WebUI.click(findTestObject('Object Repository/transaksi(add to cart)/button_Bayar (1)'))

WebUI.click(findTestObject('transaksi(add to cart)/a_Kembali ke Beranda'))

WebUI.click(findTestObject('transaksi(add to cart)/img_Keluar_btn-icon'))

WebUI.click(findTestObject('transaksi(add to cart)/a_Keluar'))


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.google.com/')

//WebUI.navigateToUrl('https://www.google.com/')

WebUI.click(findTestObject('Object Repository/Page_Google/input__q'))

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q'), 'this is selnium')

WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input__q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_this is selnium - Google Search/h3_What is Selenium Introduction to Seleniu_ff849d'))

WebUI.click(findTestObject('Object Repository/Page_What is Selenium Introduction to Selen_09a524/a_Brief Introduction Selenium Remote Contro_4d8fe0'))

WebUI.click(findTestObject('Object Repository/Page_What is Selenium Introduction to Selen_09a524/div_Search for_cb-close'))

WebUI.closeBrowser()


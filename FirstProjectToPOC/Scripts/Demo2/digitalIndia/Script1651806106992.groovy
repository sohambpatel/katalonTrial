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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')

WebUI.setText(findTestObject('Object Repository/Page_Google/input__q (1)'), 'digital india')

WebUI.sendKeys(findTestObject('Object Repository/Page_Google/input__q (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_digital india - Google Search/h3_Digitalindia  Digital India Programme  M_9709a5'))

WebUI.click(findTestObject('Object Repository/Page_Digitalindia  Digital India Programme _39e0dd/a_Introduction'))

WebUI.click(findTestObject('Object Repository/Page_Introduction  Digital India Programme _7f7fa8/a_Feedback'))

WebUI.setText(findTestObject('Object Repository/Page_Contact 4  Digital India Programme  Mi_b7cd49/input__name'), 'soham')

WebUI.closeBrowser()


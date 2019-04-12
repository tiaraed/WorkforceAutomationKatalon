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

WebUI.setText(findTestObject('Page_Asyst Workforce asd/input_Email_inp_lgn_email'), 'haris.ilham')

WebUI.setEncryptedText(findTestObject('Page_Asyst Workforce asd/input_Password_inp_lgn_passwor'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Asyst Workforce asd/button_Login'))

WebUI.click(findTestObject('Page_Asyst Workforce asd/span_Base Data'))

WebUI.waitForElementVisible(findTestObject('Page_Asyst Workforce asd/span_Flight'), 60)

WebUI.click(findTestObject('Page_Asyst Workforce asd/span_Flight'))

WebUI.waitForElementVisible(findTestObject('Page_Asyst Workforce asd/span_Airline'), 60)

WebUI.click(findTestObject('Page_Asyst Workforce asd/span_Airline'))

WebUI.verifyElementPresent(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline/button_Add New'), 
    30)


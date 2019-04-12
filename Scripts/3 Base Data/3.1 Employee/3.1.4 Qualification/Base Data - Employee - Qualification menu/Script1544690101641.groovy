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

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Base Data'))

WebUI.waitForElementVisible(findTestObject('Page_WorkForce Management System As/span_Employee'), 50)

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Employee'))

WebUI.waitForElementVisible(findTestObject('Page_WorkForce Management System As/span_Qualification'), 50)

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Qualification'))

WebUI.verifyElementPresent(findTestObject('Page_WorkForce Management System As/h1_Qualification'), 50)


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

WebUI.callTestCase(findTestCase('0 Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3 Base Data/3.1 Employee/3.1.1 Employee Information/Base Data - Employee - Employee Information Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input_Employee_inp_emp_search (1)'), 
    'firdaus')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/span_Search (1)'))

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/i_Y_fa fa-trash'))

WebUI.verifyTextPresent('Are you sure to delete this data ?', true)

WebUI.click(findTestObject('Page_WorkForce Management System As/input_Are you sure to delete no'))

WebUI.verifyElementPresent(findTestObject('Page_WorkForce Management System As/h1_Employee'), 50)


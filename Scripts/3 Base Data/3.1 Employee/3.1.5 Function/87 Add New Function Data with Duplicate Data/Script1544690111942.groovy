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

WebUI.callTestCase(findTestCase('3 Base Data/3.1 Employee/3.1.5 Function/Base Data - Employee - Function menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_WorkForce Management System As/button_Add New (3)'))

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_func_code'), 'AA_EDIT_BB')

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_func_name'), 'Ini aaa name')

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_Qualification_dual-listb (1)'), 'Edit')

WebUI.click(findTestObject('Page_WorkForce Management System As/li_PB_BI_EDIT'))

WebUI.click(findTestObject('Page_WorkForce Management System As/button_add (1)'))

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Save (4)'))

WebUI.verifyTextPresent('Function Code Already Exist', true)

WebUI.closeBrowser()


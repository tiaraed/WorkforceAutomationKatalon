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

WebUI.callTestCase(findTestCase('3 Base Data/3.1 Employee/3.1.1 Employee Information/Base Data - Employee - Employee Information Menu'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_WorkForce Management System Asyst/input_Employee Information_inp_emp_search'), 'aaaakkkk')

WebUI.click(findTestObject('Page_WorkForce Management System Asyst/button_Search (3)'))

WebUI.click(findTestObject('Page_WorkForce Management System Asyst/i_Y_fa fa-edit'))

WebUI.click(findTestObject('Page_WorkForce Management System Asyst/i_CGKAS_MPL_BTT_fa fa-edit'))

WebUI.selectOptionByValue(findTestObject('Page_WorkForce Management System Asyst/select_-- Lists function --CGKAS_MPL_BTT'), 
    'CGKAS_MPL_LM', true)

WebUI.click(findTestObject('Page_WorkForce Management System Asyst/button_Save_function'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Save'))

WebUI.delay(3)

WebUI.verifyTextPresent('Data has been Input succesfully', true)


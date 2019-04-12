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

WebUI.callTestCase(findTestCase('3 Base Data/3.1 Employee/3.1.4 Qualification/Base Data - Employee - Qualification menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_Qualification_inp_qua_se'), 'aaaccckkk')

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Search (3)'))

WebUI.click(findTestObject('Page_WorkForce Management System As/i_Y_fa fa-edit (2)'))

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_qua_name'), 'AAACCC')

WebUI.click(findTestObject('Page_WorkForce Management System As/li_CGKAS_MPL_LM'))

WebUI.click(findTestObject('Page_WorkForce Management System As/button_add'))

WebUI.click(findTestObject('Page_WorkForce Management System As/li_CGKAS_MPL_RAMP'))

WebUI.click(findTestObject('Page_WorkForce Management System As/button_add'))

WebUI.click(findTestObject('Page_WorkForce Management System As/li_CGKAS_MPL_MARSHALL'))

WebUI.click(findTestObject('Page_WorkForce Management System As/button_add'))

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Save'))

WebUI.verifyTextPresent('Data has been Input succesfully', true)

WebUI.click(findTestObject('Page_WorkForce Management System As/input_Data has been Input succ'))


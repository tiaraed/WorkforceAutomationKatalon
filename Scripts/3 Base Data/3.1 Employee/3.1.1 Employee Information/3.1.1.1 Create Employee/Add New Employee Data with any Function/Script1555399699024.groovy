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

WebUI.click(findTestObject('Page_WorkForce Management System As/button_Add New'))

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_empid'), 'hehheheh')

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_First Name_inp_first_nam'), 'aaaaaaabbbbbbbbbbbb')

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_last_name'), 'Buba')

WebUI.selectOptionByValue(findTestObject('Page_WorkForce Management System As/select_--Gender--'), 'FEMALE', true)

WebUI.selectOptionByValue(findTestObject('Page_WorkForce Management System As/select_-- Lists Group --UPGPBG'), 'CGKPB_GA_GTE', 
    true)

WebUI.click(findTestObject('Page_WorkForce Management System Asyst/button_Add New function'))

WebUI.selectOptionByValue(findTestObject('Page_WorkForce Management System Asyst/select_-- Lists function --CGKAS_MPL_BTT'), 
    'CGKAS_MPL_BTT', true)

WebUI.click(findTestObject('Page_WorkForce Management System Asyst/input_Function Name_cek_func_start'))

WebUI.click(findTestObject('Page_WorkForce Management System Asyst/input_Start Date_cek_func_end'))

WebUI.setText(findTestObject('Page_WorkForce Management System Asyst/input_Start Date_inp_start_func'), '2019-04-16')

WebUI.setText(findTestObject('Page_WorkForce Management System Asyst/input_End Date_inp_end_func'), '2019-06-06')

WebUI.click(findTestObject('Page_WorkForce Management System Asyst/button_Save_function'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Save'))

WebUI.delay(3)

WebUI.verifyTextPresent('Data has been Input succesfully', true)


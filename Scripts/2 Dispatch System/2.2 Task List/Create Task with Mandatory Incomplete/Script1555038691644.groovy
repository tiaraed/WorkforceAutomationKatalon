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

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/span_Dispatch System'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_WorkForce Management System As/span_Task List'), 50)

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/span_Task List'))

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/button_Add New (8)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_WorkForce Management System As/input_Task Definition_inp_task'), 
    50)

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input_Task Definition_inp_task'), 'Testing3')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_task_qua'), 'cki')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/a_PB_BI_CKI'))

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_task_qua'), '')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_start_date task list'), '')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_task_start_time'), '09:40')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_task_end_time'), '09:50')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input_Employee Name_inp_emp_na'), 'alfian')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/a_ALFIAN PRADITYA'))

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input_Employee Name_inp_emp_na'), 'ALFIAN PRADITYA')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_func_name (1)'), 'cki')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/a_CGKPB_BI_CKI'))

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_func_name (1)'), 'CGKPB_BI_CKI')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_shift_start_date task list'), 
    '2019-02-28')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/button_Save (5)'))

WebUI.verifyTextPresent('Required', true)


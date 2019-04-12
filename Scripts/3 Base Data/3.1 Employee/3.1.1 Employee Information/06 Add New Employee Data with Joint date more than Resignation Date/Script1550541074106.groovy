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

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/button_Add New'))

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_empid'), '06121980')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input_First Name_inp_first_nam'), 'Zalzala')

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System As/input__inp_last_name'), 'Lillah')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WorkForce Management System As/select_--Gender--'), 'FEMALE', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WorkForce Management System As/select_-- Lists Group --UPGPBG'), 
    'GROUP1', true)

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_Join Date_inp_join'), '2019-02-19')

WebUI.click(findTestObject('Page_WorkForce Management System As/input_Join Date_cek_resign'))

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_Resignation_inp_resign'), '2018-02-02')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/span_Save'))

WebUI.verifyTextPresent('Join Date must be smaller than Resignation Date', true)


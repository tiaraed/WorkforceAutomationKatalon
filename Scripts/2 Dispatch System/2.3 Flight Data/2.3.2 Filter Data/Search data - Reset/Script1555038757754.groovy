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

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Dispatch System'))

WebUI.waitForElementVisible(findTestObject('Page_WorkForce Management System As/span_Flight Data'), 50)

WebUI.click(findTestObject('Page_WorkForce Management System As/span_Flight Data'))

WebUI.selectOptionByValue(findTestObject('Page_WorkForce Management System As/select_-- Lists station --AANA_1'), 'CGK', 
    true)

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_Select Date_inp_search_d'), '2018-10-24')

WebUI.selectOptionByValue(findTestObject('Page_WorkForce Management System As/select_-- Table Data -- (1)'), 'stand', true)

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_Search Data By_inp_fligh'), 'x31')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/i_Search Data By_btn_flight_da'))

WebUI.verifyTextPresent('KE 6565', true)


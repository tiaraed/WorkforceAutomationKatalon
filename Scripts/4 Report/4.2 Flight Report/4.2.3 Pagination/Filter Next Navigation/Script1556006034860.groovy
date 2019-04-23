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

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/span_Report'))

WebUI.waitForElementVisible(findTestObject('Page_WorkForce Management System As/span_Flight Report'), 50)

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/span_Flight Report'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_WorkForce Management System As/select_-- Lists station --AANA (2)'), 
    'CGK', true)

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_Date From_inp_search_dat'), '2018-10-01')

WebUI.setText(findTestObject('Page_WorkForce Management System As/input_Date To_inp_search_datet'), '2019-01-31')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/button_Search (5)'))

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/a_Page 1 of 6_lnk_rpt_flight_n'))

WebUI.verifyTextPresent('BI 303', true)

not_run: WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/button_Reset (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/a_4 (3)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System As/a_Page 4 of 6_lnk_rpt_flight_p'))


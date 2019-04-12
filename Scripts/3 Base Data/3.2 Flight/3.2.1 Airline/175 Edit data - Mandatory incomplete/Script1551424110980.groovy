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

WebUI.callTestCase(findTestCase('3 Base Data/3.2 Flight/3.2.1 Airline/Prerequisite - Flight - Airline'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline/input_Airline_inp_airline_sear'), 
    'KK')

WebUI.click(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline/button_Search'))

WebUI.click(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline/i_Y_fa fa-edit_1'))

WebUI.setText(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline/input__inp_icao'), 
    '')

WebUI.setText(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline/input__inp_desc'), 
    '')

WebUI.click(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline/label_Required'), 
    30)


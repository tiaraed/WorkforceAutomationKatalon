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

WebUI.callTestCase(findTestCase('3 Base Data/3.2 Flight/3.2.2 Airline Group/Prerequisite - Flight - Airline Group'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline Group/input_Airline Group_inp_airlin'), 
    'GH')

WebUI.click(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline Group/button_Search'))

WebUI.click(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline Group/i_Y_fa fa-trash'))

WebUI.click(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Airline Group/input_Are you sure to delete t (Yes)'))

WebUI.verifyTextPresent('-- No data --', true)


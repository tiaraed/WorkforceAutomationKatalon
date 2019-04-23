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

WebUI.callTestCase(findTestCase('3 Base Data/3.2 Flight/3.2.5 Routing/Prerequisite - Flight - Routing'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Route/button_Add New'))

WebUI.setText(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Route/input__inp_routing_code'), 
    '!@#$%')

WebUI.setText(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Route/input_Routing Description_inp_'), 
    '')

WebUI.setText(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Route/input_IATA City Code_inp_iata'), 
    '')

WebUI.setText(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Route/input_ICAO Airport Code_inp_ic'), 
    '')

WebUI.click(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Route/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_WorkForce Management System As/Page_WorkForce Management System Route/label_please input Chara-z.-'), 
    60)


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

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/i_Home_icon dripicons-bell'))

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/a_See All Messages'))

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/a_Lists Notification'))

WebUI.setText(findTestObject('Object Repository/Page_WorkForce Management System Asyst/input_Employee Name_inp_manage_notif_empname'), 
    '')

WebUI.setText(findTestObject('Page_WorkForce Management System Asyst/input_Created Date_inp_manage_notif_date'), '')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/button_Search'))

WebUI.verifyTextPresent('-- No data --', true)


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

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('0 Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/span_Dispatch System'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_WorkForce Management System Asyst/span_Upload Task'), 
    50)

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/span_Upload Task'))

WebUI.uploadFile(findTestObject('Object Repository/Page_WorkForce Management System Asyst/input_Upload File_inp_file'), 
    'D:\\ASYST\\project\\ads workforce\\Book1.xlsx')

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/button_Upload (1)'))

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/input_Are you sure upload this file _popup_ok'))

WebUI.click(findTestObject('Object Repository/Page_WorkForce Management System Asyst/input_file has been uploaded successfully with 151 success record  865 failed record_popup_ok'))


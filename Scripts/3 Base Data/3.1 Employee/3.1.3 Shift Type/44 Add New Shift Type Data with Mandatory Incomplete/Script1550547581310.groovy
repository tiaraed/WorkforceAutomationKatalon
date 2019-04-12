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

WebUI.callTestCase(findTestCase('3 Base Data/3.1 Employee/3.1.3 Shift Type/Base Data - Employee - Shift Type menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_WorkForce Management System As/button_Add New (7)'))

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_shiftName'), '0000-0140')

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_publication'), '')

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_normal_from'), '00:00')

WebUI.setText(findTestObject('Page_WorkForce Management System As/input__inp_normal_until'), '01:40')

WebUI.click(findTestObject('Page_WorkForce Management System As/button_Save (3)'))

WebUI.verifyTextPresent('Required', true)

WebUI.closeBrowser()


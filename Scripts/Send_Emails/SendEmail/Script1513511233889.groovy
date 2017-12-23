import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://boxmail.veridone.net:8080/roundcube/')

WebUI.setText(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Welcome to V/input__user'), 'admin@boxmail.veridone.net')

WebUI.setText(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Welcome to V/input__pass'), 'Fuelsaga01!')

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Welcome to V/input_rcmloginsubmit'))

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Inbox/a_Compose'))

WebUI.setText(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/textarea__to'), 'nelsonayod@yahoo.co.uk')

WebUI.setText(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/input__subject'), 'testing Test automation')

WebUI.setText(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/textarea__message'), 'Testing')

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/a_Send'))

WebUI.setText(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/input_1'), 'Fuelsaga01!')

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/button_Save'))

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/button_Cancel'))

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/a_Encryption'))

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/div_messagetoolbar'))

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/a_Responses'))

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Compose/a_Send'))

WebUI.click(findTestObject('Sendmail_Objects/Page_Veridone Webmail  Inbox/a_Logout'))

WebUI.closeBrowser()


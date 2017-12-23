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

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Welcome to V/input__user'), 'nayods@boxmail.veridone.net')

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Welcome to V/input__pass'), 'Fuelsaga01!')

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Welcome to V/input_rcmloginsubmit'))

WebUI.rightClick(findTestObject('Sending_bulkMail_objects/Page_(11) Veridone Webmail  Inbox/span_subject'))

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_(11) Veridone Webmail  Inbox/a_Compose'))

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/textarea__to'), 'ne')

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/li_lson Ayod  lsonayodyahoo.co'))

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/input__subject'), 'sending Bulk emails')

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/a_Add Reply-To'))

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/input__replyto'), 'nayods@boxmail.veridone.net,donot-rely@boxmail.veridone.net')

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/a_Add Bcc'))

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/textarea__bcc'), 'brjakson@gmail.com')

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/a_Add Cc'))

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/textarea__cc'), 'james.white@yahoo.com')

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/a_Add Followup-To'))

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/input__followupto'), 'Samson.whiley@yahoo.com')

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/a_Attach'))

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/a_Send'))

WebUI.setText(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/textarea__message'), 'testings and welcome')

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_Veridone Webmail  Compose/a_Send'))

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_(10) Veridone Webmail  Inbox/a_Display images'))

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_(10) Veridone Webmail  Inbox/html_js chrome webkit'))

WebUI.click(findTestObject('Sending_bulkMail_objects/Page_(10) Veridone Webmail  Inbox/a_Logout'))

WebUI.closeBrowser()


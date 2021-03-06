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

WebUI.setText(findTestObject('AddContacts_objects/Page_Veridone Webmail  Welcome to V (1)/input__user'), 'nayods@boxmail.veridone.net')

WebUI.setText(findTestObject('AddContacts_objects/Page_Veridone Webmail  Welcome to V (1)/input__pass'), 'Fuelsaga01!')

WebUI.click(findTestObject('AddContacts_objects/Page_Veridone Webmail  Welcome to V (1)/input_rcmloginsubmit'))

WebUI.click(findTestObject('AddContacts_objects/Page_Veridone Webmail  Inbox (1)/span_Contacts'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('AddContacts_objects/Page_Veridone Webmail  Contacts (1)/span_Add contact'))

WebUI.setText(findTestObject('AddContacts_objects/Page_Veridone Webmail  Contacts (1)/input__firstname'), 'Humormann')

WebUI.setText(findTestObject('AddContacts_objects/Page_Veridone Webmail  Contacts (1)/input__surname'), 'reichenmann')

WebUI.setText(findTestObject('AddContacts_objects/Page_Veridone Webmail  Contacts (1)/input__email'), 'reichenmannH@boxmail.com')

WebUI.click(findTestObject('AddContacts_objects/Page_Veridone Webmail  Contacts (1)/input_rcmbtn103'))

WebUI.click(findTestObject('AddContacts_objects/Page_Veridone Webmail  Contacts (1)/a_Logout'))

WebUI.closeBrowser()


import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.ClickAction

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Page_Gmail/input_identifier'), 'nelson.ayod@gmail.com')

WebUI.click(findTestObject('Page_Gmail/div_ZFr60d CeoRYc'))

WebUI.setText(findTestObject('Page_Gmail/input_password'), 'Jackson5001!')

WebUI.sendKeys(findTestObject('Page_Gmail/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Inbox (109) - nelson.ayodgmail/div_akc aZ6 nH oy8Mbf nn aCl'))

WebUI.click(findTestObject('Page_Inbox (109) - nelson.ayodgmail/span_gb_ab gbii'))

WebUI.click(findTestObject('Page_Inbox (109) - nelson.ayodgmail/div_Nelson Ayod'))

WebUI.click(findTestObject('Page_Inbox (109) - nelson.ayodgmail/a_Sign out'))

WebUI.closeBrowser()


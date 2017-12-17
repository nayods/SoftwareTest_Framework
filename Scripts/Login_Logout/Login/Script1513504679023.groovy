import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.ClickAction as ClickAction
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

WebUI.navigateToUrl('https://boxmail.veridone.net:8080/roundcube/')

WebUI.setText(findTestObject('Login_Objects/Page_Veridone Webmail  Welcome to V (1)/input__user'), 'nayods@boxmail.veridone.net')

WebUI.setText(findTestObject('Login_Objects/Page_Veridone Webmail  Welcome to V (1)/input__pass'), 'Fuelsaga01!')

WebUI.sendKeys(findTestObject('Login_Objects/Page_Veridone Webmail  Welcome to V (1)/input__pass'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()


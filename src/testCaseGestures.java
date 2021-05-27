import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class testCaseGestures extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		TouchAction t=new TouchAction(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement expandList=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		WebElement customAdapter=driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		t.tap(tapOptions().withElement(element(customAdapter))).perform();
		WebElement peopleNames=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']").isDisplayed());
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement dateWidgets=driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		t.tap(tapOptions().withElement(element(dateWidgets))).perform();
		WebElement inlineption=driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
		t.tap(tapOptions().withElement(element(inlineption))).perform();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		//code to swipe an element from one object to another
		
			//longPress one element, then move from an object to another
		WebElement firstObj = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement secondObj = driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(firstObj)).withDuration(ofSeconds(2))).moveTo(element(secondObj)).release().perform();
		
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Scroll until you see the word WebView in the screen
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Drag and Drop\"));");
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		//Drag and Drop an object
		//LongPress, move and release
		WebElement circleDrag = driver.findElementsByClassName("android.view.View").get(0);
		WebElement circleDrop = driver.findElementsByClassName("android.view.View").get(2);
		t.longPress(longPressOptions().withElement(element(circleDrag))).moveTo(element(circleDrop)).release().perform();
		
		
	}

}

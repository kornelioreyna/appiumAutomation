import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class testCaseBasis extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		Thread.sleep(1000);
		driver.findElementById("android:id/checkbox").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		Thread.sleep(1000);
		driver.findElementByClassName("android.widget.EditText").sendKeys("hiThere");
		Thread.sleep(1000);
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
	}

}

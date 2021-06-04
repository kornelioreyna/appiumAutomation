import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browseChrome extends baseChrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement>driver = capabilities();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'products')]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		String label = driver.findElement(By.xpath("//a[contains(@href,'/3')]")).getText();
		System.out.println(label);
	}

}

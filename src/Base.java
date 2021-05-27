import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException  {
		// TODO Auto-generated method stub
		//Store the path of the app in f variable and then look for the app in that path
		File f = new File("src");
		File fs=new File (f,"ApiDemos-debug.apk");
		//Declare desired capabilities
		DesiredCapabilities cap= new DesiredCapabilities();
		if(device.equalsIgnoreCase("emulator")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME , "PixelAndroid9");
		}else {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME , "Android Device");
		}
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		AndroidDriver<AndroidElement> driver =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}

}

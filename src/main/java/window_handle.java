import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class window_handle {

    static WebDriver Driver = new ChromeDriver();
    public static String Sec_Tap;

    public static void main(String[] args) {

        OpenURL("https://the-internet.herokuapp.com");

        By Multiple_WindowsLocator = By.linkText("Multiple Windows");
        Driver.findElement(Multiple_WindowsLocator).click();

        By Click_HereLocator = By.linkText("Click Here");
        Driver.findElement(Click_HereLocator).click();

        System.out.println(Driver.getCurrentUrl());
        // move
       String CurrentPage_handle = Driver.getWindowHandle();
       Set<String> Handels = Driver.getWindowHandles();

       for(String h : Handels)
       {
                if(!h.equals(CurrentPage_handle))
                     Sec_Tap = h;
       }
        System.out.println(CurrentPage_handle);
        System.out.println(Sec_Tap);
       Driver.switchTo().window(Sec_Tap);
        System.out.println(Driver.getCurrentUrl());






    }

    static public void OpenURL(String url)
    {
        Driver.get(url);
    }
}

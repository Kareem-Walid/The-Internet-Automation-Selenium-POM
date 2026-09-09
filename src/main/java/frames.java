import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class frames {

    static WebDriver Driver = new ChromeDriver();
    public static void main(String[] args) {


        OpenURL("https://the-internet.herokuapp.com");


        By FramesLocator = By.linkText("Frames");
        Driver.findElement(FramesLocator).click();

        // iFrames
//        By iFrameLocator = By.linkText("iFrame");
//        Driver.findElement(iFrameLocator).click();

        // switch to frame
//        Driver.switchTo().frame("mce_0_ifr");
//        By TextField = By.cssSelector("#tinymce");
//        Driver.findElement(TextField).clear();
//        Driver.findElement(TextField).sendKeys("Kareem");
//        Driver.switchTo().parentFrame();
//        By Test = By.linkText("Elemental Selenium");
//        Driver.findElement(Test).click();

        // Nested Frame
        By NestedFramesLocator = By.linkText("Nested Frames");
        Driver.findElement(NestedFramesLocator).click();

        // Go to top frame
        Driver.switchTo().frame("frame-top");

        // go to left frame
        Driver.switchTo().frame("frame-left");
        By LeftFrame = By.tagName("body");
        System.out.println(Driver.findElement(LeftFrame).getText());

        // Get out of the left frame and go to middle frame
        Driver.switchTo().parentFrame();
        Driver.switchTo().frame("frame-middle");
        By MiddleFrame = By.tagName("div");
        System.out.println(Driver.findElement(MiddleFrame).getText());

        // get out of middle frame and go to right frame
        Driver.switchTo().parentFrame();
        Driver.switchTo().frame("frame-right");

        By RightFrame = By.xpath("//body[contains(text(),'R')]");
        System.out.println(Driver.findElement(RightFrame).getText());

        // switch to default frame
//        Driver.switchTo().parentFrame();
        Driver.switchTo().defaultContent();

        // Switch to bottom frame
        Driver.switchTo().frame("frame-bottom");
        By BottomFrame = By.xpath("//body[contains(text(),'B')]");
        System.out.println(Driver.findElement(BottomFrame).getText());





    }


    static public void OpenURL(String url)
    {
        Driver.get(url);
    }

    public static WebElement byToWebElement(By locator)
    {
        return Driver.findElement(locator);
    }

}

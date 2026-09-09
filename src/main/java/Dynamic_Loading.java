import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;


public class Dynamic_Loading {

    static WebDriver Driver = new ChromeDriver();

    static public void main(String[] args) {

        OpenURL("https://the-internet.herokuapp.com");

        By Dynamic_LoadingLocator = By.linkText("Dynamic Loading");
        Driver.findElement(Dynamic_LoadingLocator).click();

        By Element = By.linkText("Example 1: Element on page that is hidden");
        Driver.findElement(Element).click();

        By Start_Button = By.tagName("button");
        Driver.findElement(Start_Button).click();


        // Using XPath
        By Finish_Message = By.xpath("//div[@id = 'finish'] /h4");

        // Using CSS
       // By Finish_Message = By.cssSelector("body>div:nth-of-type(2)>div>div>div:nth-of-type(3)");


        // Explicit Wait
//        new WebDriverWait(Driver,Duration.ofSeconds(15)).
//                until(ExpectedConditions.visibilityOfElementLocated(Finish_Message));

        // Fluent Wait
        new FluentWait<WebDriver>(Driver).withTimeout(Duration.ofSeconds(15))
               .withMessage("Error")
               .pollingEvery(Duration.ofMillis(2L))
               .until(ExpectedConditions.visibilityOfElementLocated(Finish_Message));


        String Message = Driver.findElement(Finish_Message).getText();
        System.out.println(Message);



    }

    static public void OpenURL(String url)
    {
        Driver.get(url);
    }


}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Presses {

     static WebDriver Driver = new ChromeDriver();
    public static void main(String[] args) {

        Driver.get("https://the-internet.herokuapp.com");

        By KeyPress = By.linkText("Key Presses");
        Driver.findElement(KeyPress).click();


        // Ways to use the key of the keyboard
        // First Method
//        By tar = By.cssSelector("#target");
//        Driver.findElement(tar).sendKeys(Keys.ALT);
        // Second method
        // ex1
        // new Actions(Driver).keyDown(Keys.SHIFT).keyUp(Keys.SHIFT).perform();
        //ex2
        By tar = By.cssSelector("#target");
        new Actions(Driver).keyDown(byToWebElement(tar),Keys.SHIFT)
                .sendKeys(byToWebElement(tar),"kareem")
                .keyUp(Keys.SHIFT)
                .sendKeys(byToWebElement(tar),"kareem")
                .build()
                .perform();



        By result = By.cssSelector("#result");
        System.out.println(Driver.findElement(result).getText());



    }


    public static WebElement byToWebElement(By locator)
    {
        return Driver.findElement(locator);
    }


}

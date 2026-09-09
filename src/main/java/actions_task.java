import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_task {

    static WebDriver Driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        OpenURL("https://the-internet.herokuapp.com");


//
//        By CheckboxesLocator = By.linkText("Checkboxes");
//        Driver.findElement(CheckboxesLocator).click();
//        // Double Click
//        By CheckBox1 = By.cssSelector("[type='checkbox']:nth-of-type(1)");
//        new Actions(Driver).doubleClick(byToWebElement(CheckBox1)).perform();


        // Right Click
//        By Context_MenuLocator = By.linkText("Context Menu");
//        Driver.findElement(Context_MenuLocator).click();
//        By Hot_Spot = By.id("hot-spot");
//        new Actions(Driver).contextClick(byToWebElement(Hot_Spot)).perform();


        // Drag and Drop
//        By DragandDropLocator = By.linkText("Drag and Drop");
//        Driver.findElement(DragandDropLocator).click();
//
//        By Source = By.cssSelector("#column-a");
//        By Destination = By.cssSelector("#column-b");
//        new Actions(Driver).dragAndDrop(byToWebElement(Source),byToWebElement(Destination)).perform();


//        // Click and Hold
//        By DragandDropLocator = By.linkText("Drag and Drop");
//        Driver.findElement(DragandDropLocator).click();
//
//        By Source = By.cssSelector("#column-a");
//        By Destination = By.cssSelector("#column-b");
//        new Actions(Driver).clickAndHold(byToWebElement(Destination))
//        .moveToElement(byToWebElement(Source))
//        .release()
//        .build()
//        .perform();


        // Hover
        By HoversLocator = By.linkText("Hovers");
        Driver.findElement(HoversLocator).click();

        By User2 = By.cssSelector(".figure:nth-of-type(2)");
        new Actions(Driver).moveToElement(byToWebElement(User2)).perform();

        // 5sec then quit the window to avoid accumulate the web pages in the task bar
        Thread.sleep(8000);
        Driver.quit();
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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

    static WebDriver Driver = new ChromeDriver();

    public static void main(String[] args) {


        OpenURL("https://the-internet.herokuapp.com");

        By DropdownLocator = By.linkText("Dropdown");
        Driver.findElement(DropdownLocator).click();

        // Select Option
        By dropdown = By.cssSelector("select#dropdown");
       //  new Select(byToWebElement(dropdown).selectByIndex(1));

    }



    static public void OpenURL(String url)
    {
        Driver.get(url);
    }
}

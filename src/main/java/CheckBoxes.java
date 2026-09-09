import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    static WebDriver Driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        OpenURL("https://the-internet.herokuapp.com");

        By CheckboxesLocator = By.linkText("Checkboxes");
       Driver.findElement(CheckboxesLocator).click();

        // Checkboxes
        // Check box 1
        By CheckBox1 = By.cssSelector("[type='checkbox']:nth-of-type(1)");
        Driver.findElement(CheckBox1).click();

        // Check
        boolean result = Driver.findElement(CheckBox1).isDisplayed();
        System.out.println(result);

        //Uncheck box 2
        By CheckBox2 = By.cssSelector("[type='checkbox']:nth-of-type(2)");
        Driver.findElement(CheckBox2).click();


    }


    static public void OpenURL(String url)
    {
        Driver.get(url);
    }
}

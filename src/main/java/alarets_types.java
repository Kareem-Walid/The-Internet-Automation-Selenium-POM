import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alarets_types {

    static WebDriver Driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        Driver.get("https://the-internet.herokuapp.com");

        By JSAlert = By.linkText("JavaScript Alerts");
        Driver.findElement(JSAlert).click();


//        //First Type of Alerts
//        // Click for JS Alerts
//        By JSAlertLocator = By.tagName("button");
//        Driver.findElement(JSAlertLocator).click();
//        // Click on the Alert
//        System.out.println(Driver.switchTo().alert().getText());
//        Driver.switchTo().alert().accept();
//        // Get the result
//        By result = By.xpath("//p[@id='result']");
//        System.out.println(Driver.findElement(result).getText());


        // Second typ of Alerts
//        By JSConfirmLocator = By.cssSelector("[onclick = 'jsConfirm()']");
//        Driver.findElement(JSConfirmLocator).click();
//        System.out.println(Driver.switchTo().alert().getText());
//        Driver.switchTo().alert().dismiss();
//        By result = By.xpath("//p[@id='result']");
//        System.out.println(Driver.findElement(result).getText());


        // Third type of Alerts
        By JSPrompt = By.cssSelector("[onclick = 'jsPrompt()']");
        Driver.findElement(JSPrompt).click();
        Driver.switchTo().alert().sendKeys("Kareem Walid");
        Driver.switchTo().alert().accept();
        By result = By.xpath("//p[@id='result']");
        System.out.println(Driver.findElement(result).getText());



        Thread.sleep(15000);
        Driver.quit();
    }




}

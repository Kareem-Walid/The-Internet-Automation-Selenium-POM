import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {

    static WebDriver Driver = new ChromeDriver();
    static public void main(String[] args) throws AWTException, InterruptedException {

        Driver.get("https://the-internet.herokuapp.com");

        By FileUpload = By.linkText("File Upload");
        Driver.findElement(FileUpload).click();

        String path = "C:\\Users\\Kareem Walid\\Pictures\\Screenshotsimage.png";
        // using Sendkeys function
//        By FileUploadLocator = By.id("file-upload");
//        Driver.findElement(FileUploadLocator).sendKeys(path);

          // Robot Class

          By DragandDropLocator = By.cssSelector("div>div#drag-drop-upload");
          Driver.findElement(DragandDropLocator).click();
          StringSelection stringselection = new StringSelection(path);   //Ctrl + C
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
          Robot robot = new Robot();
          robot.delay(2000);
          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
          robot.delay(2000);

          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.delay(2000);
          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);


          // Click on File Upload
          Thread.sleep(2000);
          By UploadButtonLocator = By.id("file-submit");
          Driver.findElement(UploadButtonLocator).click();

          By Meg = By.id("uploaded-files");
          System.out.println(Driver.findElement(Meg).getText());

    }
}

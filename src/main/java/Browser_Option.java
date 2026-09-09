import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Option {



     static WebDriver Driver;
     public static void main(String[] args) {


         ChromeOptions chromeOpt = new ChromeOptions();
         // Open the browser in the Incognito Mode
         chromeOpt.addArguments("--guest");
         // Run the script in the headless(i.e run script in the background)
         chromeOpt.addArguments("--headless");
         // Start Maximized
         chromeOpt.addArguments("--start-maximized");
         // Add extension
         // chromeOpt.addExtensions("");

        Driver = new ChromeDriver(chromeOpt);









     }
}

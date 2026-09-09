import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screen_shot {



    static WebDriver Driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {

        Driver.get("https://the-internet.herokuapp.com");
        String path = "C:\\Users\\Kareem Walid\\Pictures\\Screenshots";
        File src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
        File target = new File(path+"image"+".png");
        FileUtils.copyFile(src,target);




    }

}

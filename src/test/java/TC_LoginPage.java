import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.log.Log;

import java.time.Duration;

public class TC_LoginPage {

    private WebDriver Driver;
    LoginPage loginpage;


    public void SetupDriver()
    {
        Driver = new ChromeDriver();
        Driver.get("https://the-internet.herokuapp.com/login");
        Driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
    }



    // TC 001
    public void ValidLoginTC()
    {
//        loginpage = new LoginPage(Driver);
//        loginpage.EnterUsername("tomsmith");
//        loginpage.EnterPassword("SuperSecretPassword!");
//        loginpage.LoginButton();

          // Anonymous object
          new LoginPage(Driver).EnterUsername("tomsmith");
          new LoginPage(Driver).EnterPassword("SuperSecretPassword!");
          new LoginPage(Driver).LoginButton();

    }



}

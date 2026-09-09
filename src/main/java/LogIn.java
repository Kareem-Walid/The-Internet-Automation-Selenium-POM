import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


class LogIn {

    static WebDriver Driver = new ChromeDriver();

    static String username = "tomsmith";
    static String password = "SuperSecretPassword!";
    static public void main(String[] args) throws InterruptedException {

        // Open the first page of the website
        OpenURL("https://the-internet.herokuapp.com");

        // navigate to the form authentication
        By Form_AuthenticationLocator = By.linkText("Form Authentication");
        Driver.findElement(Form_AuthenticationLocator).click();
        Thread.sleep(1500);

        Login(username,password);
        Thread.sleep(1500);

        Click();
        Thread.sleep(1500);


        String Error_Message = "Your username is invalid! ";
        String successfully_Login_Message = "You logged into a secure area!";
        String Actual_Message =  GetText();

          if(Actual_Message.equals(successfully_Login_Message))
          {
              System.out.println("Log in Successfully");
          }else if (Actual_Message.equals(Error_Message))
          {
              System.out.println("Username or Password Incorrect");
          }else{
              System.out.println("Error");
          }



    }


    static public void OpenURL(String url)
    {
        Driver.get(url);
    }

    static private void Login(String Username,String Password)
    {
        By UsernameLocator = By.id("username");
        Driver.findElement(UsernameLocator).sendKeys(Username);

        By PasswordLocator = By.name("password");
        Driver.findElement(PasswordLocator).sendKeys(Password);
    }

    static public void Click()
    {
        By LoginButtonLocator = By.className("radius");
        Driver.findElement(LoginButtonLocator).click();
    }


    static public String GetText()
    {
        By LoginFlashMessage = By.id("flash");
        return Driver.findElement(LoginFlashMessage).getText();
    }

}

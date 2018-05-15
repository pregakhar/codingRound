package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Helper;

public class SignInPage extends HomePage{

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void signIn() {
        driver.findElement(By.linkText("Your trips")).click();
        driver.findElement(By.id("SignIn")).click();
        Helper.waitFor(5000);
        driver.switchTo().frame(driver.findElement(By.id("modal_window")));
        driver.findElement(By.id("signInButton")).click();
    }
}

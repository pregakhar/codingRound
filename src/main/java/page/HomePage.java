package page;

import org.openqa.selenium.WebDriver;
import util.Helper;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        open();
    }

    public void open() {
        driver.get("https://www.cleartrip.com/");
    }
}

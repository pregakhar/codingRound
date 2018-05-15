import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FlightPage;
import util.Helper;

public class FlightBookingTest {

    WebDriver driver = Helper.buildDriver();

    @Test
    public void testThatResultsAppearForAOneWayJourney() {

        Helper.setDriverPath();
        driver.get("https://www.cleartrip.com/");

        new FlightPage(driver).search();

        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(By.className("searchSummary")));

        //close the browser
        driver.quit();

    }

    private boolean isElementPresent(By by) {
        try {
            new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.presenceOfElementLocated(by));
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

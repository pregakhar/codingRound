import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import page.HotelPage;
import util.Helper;

public class HotelBookingTest {

    WebDriver driver;

    public HotelBookingTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void shouldBeAbleToSearchForHotels() {
        Helper.setDriverPath();

        new HotelPage(driver).search();

        driver.quit();
    }
}

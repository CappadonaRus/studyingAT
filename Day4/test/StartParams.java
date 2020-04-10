import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class StartParams {
    public static WebDriver chromeDriver;
    public static WebDriver firefoxDriver;

    @BeforeClass
    public void setUpClassParams(){
        chromeDriver = new ChromeDriver();
        firefoxDriver = new FirefoxDriver();
    }

    @AfterClass
    public void closingSetUps() {
        chromeDriver.quit();
        firefoxDriver.quit();
    }
}

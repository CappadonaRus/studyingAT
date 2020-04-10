import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample2Test extends StartParams {

    @BeforeClass
    public void setUp() {
        String baseUrl = "http://demo.guru99.com/test/login.html";
        chromeDriver.get(baseUrl);
        firefoxDriver.get(baseUrl);
    }

    @Test
    public void chromeLoginTest() {
        loginTest(chromeDriver);
    }

    @Test
    public void firefoxLoginTest() {
        loginTest(firefoxDriver);
    }


    public void loginTest(WebDriver webDriver) {
        WebElement email = webDriver.findElement(By.id("email"));
        WebElement password = webDriver.findElement(By.name("passwd"));
        WebElement login = webDriver.findElement(By.id("SubmitLogin"));

        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");

        login.click();

        WebElement webElement = webDriver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));

        Assert.assertEquals(webElement.getText(), "Successfully Logged in...");

    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidationDemoTest extends StartParams {
    @BeforeClass
    public void setUp() {
        String baseUrl = "http://demo.guru99.com/V1/index.php";
        chromeDriver.get(baseUrl);
        firefoxDriver.get(baseUrl);
    }

    @Test
    public void chromeValidationTest() {
        validationTest(chromeDriver);
    }

    @Test
    public void firefoxValidationTest() {
        validationTest(firefoxDriver);
    }


    public void validationTest(WebDriver webDriver) {
        WebElement usernameControl = webDriver.findElement(By.name("uid"));
        WebElement passwordControl = webDriver.findElement(By.name("password"));
        WebElement misc = webDriver.findElement(By.cssSelector("body"));

        usernameControl.click();
        passwordControl.click();
        misc.click();

        WebElement userValidationMessage = webDriver.findElement(By.id("message23"));
        WebElement passwordValidationMessage = webDriver.findElement(By.id("message18"));

        Assert.assertEquals(userValidationMessage.getText(), "User-ID must not be blank");
        Assert.assertEquals(passwordValidationMessage.getText(), "Password must not be blank");

    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTipTest extends StartParams {

    @BeforeClass
    public void setUp() {
        String baseUrl = "http://demo.guru99.com/test/social-icon.html";
        chromeDriver.get(baseUrl);
        firefoxDriver.get(baseUrl);
    }

    @Test
    public void chromeExpectedTool(){
        expectedTool(chromeDriver);
    }

    @Test
    public void firefoxExpectedTool(){
        expectedTool(firefoxDriver);
    }

    public void expectedTool(WebDriver webDriver) {
        WebElement githubElement = webDriver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));

        String actualTooltip = githubElement.getAttribute("title");

        String expectedTooltip = "Github";
        Assert.assertEquals(actualTooltip, expectedTooltip);
    }

}


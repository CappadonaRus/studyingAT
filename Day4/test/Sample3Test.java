import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample3Test extends StartParams {

    @BeforeClass
    public void setUp() {
        String baseUrl = "http://demo.guru99.com/test/upload/";
        chromeDriver.get(baseUrl);
        firefoxDriver.get(baseUrl);
    }

    @Test
    public void chromeUploadFile(){
        uploadingFile(chromeDriver);
    }
    @Test
    public void firefoxUploadFile(){
        uploadingFile(firefoxDriver);
    }



    public void uploadingFile(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        WebElement uploadElement = webDriver.findElement(By.id("uploadfile_0"));

        uploadElement.sendKeys("C:\\selenium\\testfile.txt");

        webDriver.findElement(By.id("terms")).click();
        WebElement submitButton = webDriver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebElement resultElement = webDriver.findElement(By.cssSelector("#res"));
        WebElement resultText = webDriver.findElement(By.cssSelector("#res > center"));

        wait.until(ExpectedConditions.attributeContains(resultElement, "style", "display: block"));

        String expectedResult = "1 file\n" +
                "has been successfully uploaded.";
        Assert.assertEquals(resultText.getText(), expectedResult);
    }
}

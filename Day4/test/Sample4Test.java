import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Sample4Test extends StartParams {

    @BeforeClass
    public void setUp() {
        String baseUrl = "http://demo.guru99.com/test/yahoo.html";
        chromeDriver.get(baseUrl);
        firefoxDriver.get(baseUrl);
    }

    @Test
    public void chromeDownloadFile(){
        downloadFile(chromeDriver);
    }
    @Test
    public void firefoxDownloadFile(){
        downloadFile(firefoxDriver);
    }


    public void downloadFile(WebDriver webDriver) {
        WebElement downloadButton = webDriver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");

        String wgetCommand = "wget -P C:\\selenium --no-check-certificate " + sourceLocation;
        int exitVal = -1;
        try {
            Process exec = Runtime.getRuntime().exec(wgetCommand);
            exitVal = exec.waitFor();
        } catch (InterruptedException | IOException ex) {
            ex.printStackTrace();
        } finally {
            webDriver.quit();
        }
        File tmpDir = new File("C:\\selenium\\msgr11us.exe");

        Assert.assertEquals(exitVal, 0);
        Assert.assertTrue(tmpDir.exists(), "file download");
        tmpDir.delete();
    }
}

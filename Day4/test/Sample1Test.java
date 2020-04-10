import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample1Test extends StartParams {


    @BeforeClass
    public void setUp() {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        chromeDriver.get(baseUrl);
        firefoxDriver.get(baseUrl);
    }

    @Test
    public void titleTest() {
        Assert.assertEquals(firefoxDriver.getTitle(), "Welcome: Mercury Tours");
        Assert.assertEquals(chromeDriver.getTitle(), "Welcome: Mercury Tours");
    }
}


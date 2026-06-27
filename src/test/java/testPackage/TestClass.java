package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void test(){

        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://wwww.google.com");

    }
    //testNG>> Test suite > test > test class > test method
}

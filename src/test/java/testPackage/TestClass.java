package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
    }
    // This is a test class for Selenium WebDriver using TestNG framework. It initializes a ChromeDriver instance to perform web automation tasks. The test method can be expanded to include specific test cases and assertions as needed.
}

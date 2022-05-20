package Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver(){
        driver = new ChromeDriver();
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
    }

    @Test
    void NewObjectTest() {
        new WomenPage(driver).SizeS.click();
        new WomenPage(driver).SizeM.click();

    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
    }




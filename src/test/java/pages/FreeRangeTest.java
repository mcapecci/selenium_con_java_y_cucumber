package pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FreeRangeTest {
    private WebDriver driver = new ChromeDriver();

    @Before
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    @Test
    public void navegamosAFreeRangeTesters(){
        // Navega a la pagina web
        driver.get("https://www.freerangetesters.com");
    }

    /**
     * BeforeMethod
     * es para indicar que se ejecute al principio de cada método (@Test)
    @BeforeMethod
    public void setUp(){
        // Inicializa el WebDriver para chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
     */

    /**
     * AfterMethod
     * luego de que cada método (@Test) corra va a ejecutarse el AfterMethod

    @AfterMethod
    public void tearDown(){
        // Cierra el navegador después de la prueba
        if (driver != null){
            driver.quit();
        }
    }
     */

}

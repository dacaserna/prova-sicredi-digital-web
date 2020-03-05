package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected static long horario;
    protected static final String NAVEGADOR = "chrome";
    protected static WebDriver driver;

    protected BaseTest(){
        if (NAVEGADOR.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", ".\\wdrivers\\chrome\\79.0.3945.36\\chromedriver.exe");
        } else if (NAVEGADOR.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", ".\\wdrivers\\firefox\\0.26.0\\geckodriver.exe");
        }
        horario = System.currentTimeMillis();
    }

    @BeforeMethod
    public void preCondition() {
        if (NAVEGADOR.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (NAVEGADOR.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void posCondition() {
        driver.close();
        driver.quit();
    }

}

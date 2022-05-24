import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstScript {
    WebDriver webdriver;
    @Test
    public void firstTest() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        this.webdriver = SelfHealingDriver.create(driver);
        this.webdriver.manage().window().maximize();
        this.webdriver.get("https://www.google.com");
        this.webdriver.findElement(By.xpath("//a[contains(text(),\"Gmail\")]")).click();
        Thread.sleep(8000);
        this.webdriver.findElement(By.xpath("//a[contains(text(),\"For work\")]/parent::div[@class=\"header__aside__buttons\"]/a[contains(text(),\"For work\")]")).click();
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;



public class Onliner {

    @Test
    public void onlinerTest() {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.onliner.by/");

        
        WebElement trampoline = driver.findElement(By.xpath("//a [@href='https://catalog.onliner.by/trampoline']"));
        /* //span[@class= 'project-navigation__sign' and contains(text(), 'Батуты')] */
        trampoline.click();


        driver.close();
    }
}
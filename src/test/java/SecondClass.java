import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondClass {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
    driver = new ChromeDriver();
    }

    @Test
    public void openWikipediaTest() throws InterruptedException {

    driver.get("https://www.wikipedia.org/");
    Thread.sleep(3000);
    driver.findElement(By.partialLinkText("English")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Log in")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("wpName1")).click();
    driver.findElement(By.id("wpName1")).clear();
    driver.findElement(By.id("wpName1")).sendKeys("Romanich87");
    driver.findElement(By.name("wpPassword")).click();
    driver.findElement(By.name("wpPassword")).clear();
    driver.findElement(By.name("wpPassword")).sendKeys("romaroma87");
    driver.findElement(By.id("wpLoginAttempt")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Log out")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Log in")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("wpName1")).click();
    driver.findElement(By.id("wpName1")).clear();
    driver.findElement(By.id("wpName1")).sendKeys("Romanich87");
    driver.findElement(By.name("wpPassword")).click();
    driver.findElement(By.name("wpPassword")).clear();
    driver.findElement(By.name("wpPassword")).sendKeys("romaroma87");
    driver.findElement(By.id("wpLoginAttempt")).click();
    Thread.sleep(5000);




    }


    @AfterMethod
    public void tearDown(){
    driver.quit();
    }


}

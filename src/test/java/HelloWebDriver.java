import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HelloWebDriver {
  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    driver.get("http://seleniumhq.org");
     WebElement searchInput = driver.findElement(By.id("gsc-i-id1"));
     searchInput.sendKeys("selenium java");
    WebElement searchBtn = driver.findElement(By.xpath("//*[@id='navbar']/div[2]/div/img"));
     searchBtn.click();
     Thread.sleep(2000);
    driver.quit();

  }
}

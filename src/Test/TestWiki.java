package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestWiki{
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\absol\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:\\Users\\absol\\Downloads\\MicrosoftWebDriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        driver.get("https://www.wikipedia.org");
        WebElement link = driver.findElement(By.id("js-link-box-en"));
        ((JavascriptExecutor) driver).executeScript("window.resizeTo(1024,768;)");
        link.click();
        Thread.sleep(5000);
        WebElement searchBox;
        searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("lobotomy");
        searchBox.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}
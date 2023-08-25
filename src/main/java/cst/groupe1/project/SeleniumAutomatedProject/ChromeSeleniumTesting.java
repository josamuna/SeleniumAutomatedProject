package cst.groupe1.project.SeleniumAutomatedProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

public class ChromeSeleniumTesting {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        try {
        	driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("https://www.ur.ac.rw" + Keys.ENTER);
            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
            System.out.println(firstResult.getAttribute("textContent"));
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("https://admissions.ur.ac.rw" + Keys.ENTER);
            WebElement secondResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
            System.out.println(secondResult.getAttribute("textContent"));
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("https://booking.com" + Keys.ENTER);
            WebElement thirdResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
            System.out.println(thirdResult.getAttribute("textContent"));
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("cars" + Keys.ENTER);
            WebElement fourthResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
            System.out.println(fourthResult.getAttribute("textContent"));
        } finally {
            driver.quit();
        }
	}
}

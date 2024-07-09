package BMICalculation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BMITest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        // Initialize Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the Webpage
        driver.get("https://www.calculator.net/bmi-calculator.html");

        // Optional: Maximize the browser window
        driver.manage().window().maximize();

        // Optional: Wait for some time (e.g., 10 seconds) to see the page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement age = driver.findElement(By.xpath("//*[@id='cage']"));
        age.click();
        age.clear();
        age.sendKeys("40");

      //  WebElement gender = driver.findElement(By.xpath("//*[@id='csex1']"));
       // gender.click();

        WebElement heightFeet = driver.findElement(By.xpath("//*[@id='cheightfeet']"));
        heightFeet.click();
        heightFeet.clear();
        heightFeet.sendKeys("5");

        WebElement heightInches = driver.findElement(By.xpath("//*[@id='cheightinch']"));
        heightInches.click();
        heightInches.clear();
        heightInches.sendKeys("2");

        WebElement weight = driver.findElement(By.xpath("//*[@id='cpound']"));
        weight.click();
        weight.clear();
        weight.sendKeys("170");


        WebElement calculate = driver.findElement(By.xpath("//input[@type='submit']"));
        String BMI = driver.findElement(By.xpath("//*[@id='content']/div[4]/div[1]/b/text()")).getText();

        // Close the browser
         driver.quit();
    }

}

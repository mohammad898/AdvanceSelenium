import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = null;

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohammad.haque01\\Desktop\\Testing\\SeleniumAdvance\\browser-driver\\chromedriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        //driver.get("https://www.amazon.com/");
        driver.get(" file:///C:/Users/mohammad.haque01/Desktop/alerts.html");
        driver.manage().window().maximize();

        //driver.findElement(By.id("aa")).click();
        driver.findElement(By.id("bb")).click();


       Thread.sleep(3000);

        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
   // Accepting alert
        alert.accept();
       // alert.dismiss();




        driver.findElement(By.id("cc")).click();

        // Switching to Alert
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000);
        //Send the value
        alert.sendKeys("Papia");
        //driver.switchTo().alert().sendKeys("Papia");
        Thread.sleep(3000);


        //driver.switchTo().alert().accept();
       // driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().getText();
    }



}
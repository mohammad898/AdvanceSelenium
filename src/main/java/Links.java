import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Links {
    @Test
    public void test(){
        WebDriver driver=null;

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohammad.haque01\\Desktop\\Testing\\SeleniumAdvance\\browser-driver\\chromedriver.exe");

         driver= new FirefoxDriver();
         driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        //driver.get("https://www.amazon.com/");
        driver.get("  https: papia:12345@www.google.com/");


        driver.manage().window().maximize();
//=========================================


        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());




 for(WebElement alllinks:links){
            System.out.println( alllinks.getText() + " - " +  alllinks.getAttribute("href"));
        }


/**
 for (int i = 1; i<=links.size(); i=i+1)

        {

            System.out.println(links.get(i).getText());

        }

*/
}
}

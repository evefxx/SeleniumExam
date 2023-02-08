import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

class rattana {

    @Test
    void rattana () throws InterruptedException {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://nxtgenaiacademy.com/demo-site/");

        driver.findElement(By.id("vfb-5")).sendKeys("Rattana");
        driver.findElement(By.id("vfb-7")).sendKeys("JIrawattanakij");
        
        driver.findElement(By.id("vfb-31-2")).sendKeys("Female");
        
        driver.findElement(By.id("vfb-13-address")).sendKeys("Malaiman");
        driver.findElement(By.id("vfb-13-address-2")).sendKeys("85");
        driver.findElement(By.id("vfb-13-city")).sendKeys("Mueang");
        driver.findElement(By.id("vfb-13-state")).sendKeys("Nakhon Pathom");
        driver.findElement(By.id("vfb-13-zip")).sendKeys("73000");
        driver.findElement(By.id("vfb-14")).sendKeys("644259032@webmail.npru.ac.th");
        driver.findElement(By.id("vfb-18")).sendKeys("02/08/2023");
        driver.findElement(By.id("vfb-19")).sendKeys("0987654321");
        
        driver.findElement(By.id("vfb-20-0")).click();
        driver.findElement(By.id("vfb-20-1")).click();
        driver.findElement(By.id("vfb-20-2")).click();
        driver.findElement(By.id("vfb-20-3")).click();
        driver.findElement(By.id("vfb-20-4")).click();
        driver.findElement(By.id("vfb-20-5")).click();
        
        driver.findElement(By.id("vfb-23")).sendKeys("no");
        driver.findElement(By.id("vfb-3")).sendKeys("20");
        
        driver.findElement(By.id("vfb-4")).click();
       
        
        String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
        assertEquals("Dynamic Transaction Verification",result);
        
        String title = driver.getTitle();
        System.out.print(title);
        
        
        Thread.sleep(5000);
        driver.quit();
    }
}
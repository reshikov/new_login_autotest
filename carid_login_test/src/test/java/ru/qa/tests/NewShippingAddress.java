package ru.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class NewShippingAddress {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/Applications/Firefox.app/Contents/MacOS/geckodriver");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void NewShippingAddress() {
        wd.get("https://www.carid.com/my-account/login/");
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys("igor.re@onyxenterprises.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Temp1234");
        wd.findElement(By.xpath("//form[@id='account-login-returning-customer']/div[7]/button")).click();
        wd.findElement(By.xpath("//div[@class='js-account-info-holder']/span[.='Add New']")).click();
        wd.findElement(By.id("firstname")).click();
        wd.findElement(By.id("firstname")).clear();
        wd.findElement(By.id("firstname")).sendKeys("qa");
        wd.findElement(By.id("lastname")).click();
        wd.findElement(By.id("lastname")).clear();
        wd.findElement(By.id("lastname")).sendKeys("test");
        wd.findElement(By.id("s_address")).click();
        wd.findElement(By.id("s_address")).clear();
        wd.findElement(By.id("s_address")).sendKeys("victoria strt");
        wd.findElement(By.id("s_city")).click();
        wd.findElement(By.id("s_city")).clear();
        wd.findElement(By.id("s_city")).sendKeys("Shoreview");
        if (!wd.findElement(By.xpath("//select[@id='s_state']//option[24]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='s_state']//option[24]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='s_state']//option[24]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='s_state']//option[24]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='s_state']//option[25]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='s_state']//option[25]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='s_state']//option[25]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='s_state']//option[25]")).click();
        }
        wd.findElement(By.id("s_zipcode")).click();
        wd.findElement(By.id("s_zipcode")).clear();
        wd.findElement(By.id("s_zipcode")).sendKeys("55126");
        wd.findElement(By.id("phone")).click();
        wd.findElement(By.id("phone")).clear();
        wd.findElement(By.id("phone")).sendKeys("777");
        wd.findElement(By.id("submitBtn")).click();
        wd.findElement(By.cssSelector("div.modal-btn-blue.-full-width")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}

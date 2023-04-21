package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest
{
    WebDriver tester;
    @BeforeClass
    public void Dropdown() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        tester = new ChromeDriver();

        tester.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        tester.manage().window().maximize();
        Thread.sleep(10000);

    }
    @Test
    public void dropdown() throws InterruptedException {
        WebElement dropdown = tester.findElement(By.id("dropdowm-menu-1"));
        Select select = new Select(dropdown);
        select.selectByValue("sql");
        Thread.sleep(1000);
        WebElement dropdown2 = tester.findElement(By.id("dropdowm-menu-2"));
        Select select2 = new Select(dropdown2);
        select2.selectByValue("junit");
        Thread.sleep(1000);
        WebElement dropdown3 = tester.findElement(By.id("dropdowm-menu-3"));
        Select select3 = new Select(dropdown3);
        select3.selectByValue("jquery");
        Thread.sleep(1000);
        WebElement checkbox3 = tester.findElement(By.cssSelector("input[value='option-3']"));
        if (checkbox3.isSelected()) {
            checkbox3.click();
        }
        Thread.sleep(1000);
        WebElement checkbox1 = tester.findElement(By.cssSelector("input[value='option-1']"));
        WebElement checkbox4 = tester.findElement(By.cssSelector("input[value='option-4']"));
        checkbox1.click();
        checkbox4.click();
        Thread.sleep(1000);
        WebElement radioPurple = tester.findElement(By.cssSelector("input[value='purple']"));
        radioPurple.click();
        Thread.sleep(1000);
        tester.quit();
    }
}
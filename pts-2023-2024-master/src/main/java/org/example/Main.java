
package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\IdeaProjects\\pts-2023-2024-master\\chromedriver19-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://ais2.ukf.sk/ais/start.do");

        WebElement cookiesButton = driver.findElement(By.xpath("/html/body/div[6]/button[1]"));
        cookiesButton.click();
        Thread.sleep(1000);

        WebElement username = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[1]/form/div/div/div/table/tbody/tr[1]/td[2]/input"));
        username.sendKeys("311103");
        Thread.sleep(1000);
        WebElement passowrd = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[1]/form/div/div/div/table/tbody/tr[2]/td[2]/input"));
        passowrd.sendKeys("0010042538");
        Thread.sleep(1000);

        //prihlasenie
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-form-submit-btn\"]"));
        loginButton.click();
        Thread.sleep(1000);

        WebElement PlayVideo = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[3]/app-banner/div/div/section/mat-expansion-panel/div"));
        PlayVideo.click();
        Thread.sleep(7000);
        PlayVideo.click();
        Thread.sleep(1000);

        try {

            WebElement name = driver.findElement(By.xpath("/html/body/app-root/lib-app-header/nav/div[3]/a/span"));
            name.click();
            Thread.sleep(2000);

            WebElement logOut = driver.findElement(By.xpath("/html/body/app-root/lib-app-header/nav/div[3]/div/a/span"));
            logOut.click();
            Thread.sleep(2000);


        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        driver.quit();
    }
}

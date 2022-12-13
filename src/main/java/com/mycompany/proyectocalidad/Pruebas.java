package com.mycompany.proyectocalidad;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Pruebas {

    String driverPath = "C:\\Users\\joses\\OneDrive\\Documentos\\Selenium\\chromedriver_win32\\chromedriver.exe";
    String url = "https://www.mopt.go.cr/";

    static WebDriver driver;

    public Pruebas() {

    }

    @SuppressWarnings("empty-statement")
    public void prueba1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\joses\\OneDrive\\Documentos\\Selenium\\chromedriver_win32\\chromedriver.exe");
        try {

        } catch (Exception ex) {

        }
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[9]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[9]/ul/li[1]/a")).click();

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"j_idt7:txtCedula\"]"))));
        driver.findElement(By.xpath("//*[@id=\"j_idt7:txtCedula\"]")).sendKeys("123456789");//Pin de acceso

    }

    @SuppressWarnings("empty-statement")
    public void prueba2() {
        //Prueba 4
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\joses\\OneDrive\\Documentos\\Selenium\\chromedriver_win32\\chromedriver.exe");
        try {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[1]/footer/div/div/div[1]/div[2]/div[2]/ul/li[3]/a")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/section/div[2]/ul/li/ul/li[3]/ul/li[7]/a")).click();

        } catch (Exception ex) {
            System.err.println("Ocurrió un error durante la ejecución: " + ex);
        }

    }

    @SuppressWarnings("empty-statement")
    public void prueba3() {
        //Prueba 5
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\joses\\OneDrive\\Documentos\\Selenium\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Prueba 3");

        try {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[7]/a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/section/div[2]/div[2]/div[1]/div[1]/div/table/tbody/tr[1]/td[2]")).click();
            Thread.sleep(2000);

        } catch (Exception ex) {
            System.out.println("Ocurrió un error durante la ejecución: " + ex);
        }

    }

    @SuppressWarnings("empty-statement")
    public void prueba4() {
        //Prueba 7
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\joses\\OneDrive\\Documentos\\Selenium\\chromedriver_win32\\chromedriver.exe");
        System.out.println("Prueba 4");
        String url1 = "https://sig.mopt.go.cr:8084/web/index.html#8/9.850/-83.463";
        System.setProperty("webdriver.chrome.driver", driverPath);
        try {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[3]")).click();;
            driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[1]/nav/ul/li[3]/ul/li[4]/a")).click();
            driver.get(url1);

        } catch (Exception ex) {
            System.out.println("Ocurrió un error durante la ejecución: " + ex);
        }
    }
}

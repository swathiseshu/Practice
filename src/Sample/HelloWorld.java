package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HelloWorld {
    public static void main(String[] args) {

        String username = "abcdef";
        String password = "dfght";
       // System.out.println("Hello");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swathi Kolla\\Downloads\\New3\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demo.guru99.com/test/login.html");

//        String url = driver.getTitle();
//
//        System.out.println("Title is " + url);
//
//        driver.close();
        driver.findElement(By.id("//input[@id='email']")).sendKeys(username);





    }
}

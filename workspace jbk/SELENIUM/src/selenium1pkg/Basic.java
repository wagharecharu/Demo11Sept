package selenium1pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///E:/JAVA%20BY%20KIRAN/Software/Offline%20Website/Offline%20Website/index.html");
WebElement eid=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
eid.sendKeys("kiran@gmail.com");
WebElement pass=driver.findElement(By.id("password"));
pass.sendKeys("123456");
driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
}
}

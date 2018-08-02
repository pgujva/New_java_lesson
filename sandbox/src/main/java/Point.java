import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Point {


  public static void main(String[] args) {
    ChromeDriver wd;
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.xpath("//input[@value='Login']")).click();
    wd.findElement(By.linkText("home")).click();

    List<WebElement> elements = wd.findElements(By.name("entry"));
    for(WebElement element:elements) {
    List<WebElement> cells = element.findElements(By.tagName("td"));
      String firstname = cells.get(2).getText();
      String lastname = cells.get(1).getText();
      String id = element.findElement(By.tagName("input")).getAttribute("value");
      System.out.println(firstname);
      System.out.println(lastname);
      System.out.println(id);

    }
    wd.quit();
  }
}
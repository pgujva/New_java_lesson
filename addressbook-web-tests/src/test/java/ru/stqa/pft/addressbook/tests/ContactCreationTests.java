package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import org.openqa.selenium.*;

public class ContactCreationTests extends TestBase  {


  @BeforeMethod
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    login();

  }


  @Test
  public void testContactsCreation() throws Exception {

    initContactCreation();
    fillContactForm(new ContactData("testname", "testLastname",
                                    "testaddress",
                                    "1111", "222", "333",
                                    "1testemail", "2testemail", "3testemail"));
    submitContactCreation();
    wd.findElement(By.linkText("home")).click();
  }


  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

}

package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {
      gotoGroupPage();
      initGroupCreation();
      fillGroupForm(new GroupData("тест1", "тест2", "тест3"));
      submitGroupCreation();
      returnToGroupPage();
  }


}


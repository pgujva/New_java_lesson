package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DeligationContactsTests extends TestBase {

  @Test
  public void testDeligationContacts() throws Exception {
   app.getContactHelper().getContactLust();

  }
}
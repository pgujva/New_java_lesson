package ru.stqa.pft.addressbook.tests1.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {
  ChromeDriver wd;

  public HelperBase(ChromeDriver wd) {
    this.wd=wd;
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  protected boolean isElementPresent(By locator) {
      try {
          wd.findElement(locator);
          return true;
      }catch (NoSuchElementException ex) {
          return false;
      }
  }
}

package ru.stqa.pft.addressbook.tests1.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(ChromeDriver wd) {
    super(wd);
  }
  public void login(String username, String pass) {
    type(By.name("user"),username);
    type(By.name("pass"),pass);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}

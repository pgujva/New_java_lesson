package ru.stqa.pft.addressbook.tests1.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.GroupsHelper;
import ru.stqa.pft.addressbook.tests1.appManager.ApplicationManager;
import ru.stqa.pft.addressbook.tests1.model.GroupData;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();


  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

  public ApplicationManager getApplicationManager() {
    return app;
  }
}

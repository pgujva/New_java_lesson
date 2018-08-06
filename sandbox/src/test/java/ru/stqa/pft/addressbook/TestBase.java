package ru.stqa.pft.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


  public ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();


  }

  @AfterMethod
  public void tearDown() {
    app.stop();

  }


  public ApplicationManager getApp() {
    return app;
  }
}

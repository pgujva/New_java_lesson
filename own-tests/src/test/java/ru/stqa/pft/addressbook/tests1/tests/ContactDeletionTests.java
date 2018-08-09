package ru.stqa.pft.addressbook.tests1.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactsDeletions() throws Exception {
    app.getNavigationHelper().goToHomepage();
    app.getContactHelper().initContactDeletion();
    app.getContactHelper().submitContactDeletion();
    app.getNavigationHelper().goToHomepage();
  }
}

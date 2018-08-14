package ru.stqa.pft.addressbook.tests1.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests1.model.ContactData;

public class ContactModifictionTests extends TestBase {
  @Test
  public void testContactsModification() throws Exception {
    if (!app.getContactHelper().isThereContact()) {
      app.getContactHelper().initContactCreation();
      app.getContactHelper().fillContactForm(new ContactData("test14444", "test2", "newAddress", "1mail", "123456", null), false);
      app.getContactHelper().submitContactCreation();
      app.getContactHelper().returnToHomePage();
    }

    app.getNavigationHelper().goToHomepage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("newName", "newLastName",
            "newAddress", "newMail1", "7777", null), false);
  }
}
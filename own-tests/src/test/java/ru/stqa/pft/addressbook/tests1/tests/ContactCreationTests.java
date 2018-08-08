package ru.stqa.pft.addressbook.tests1.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests1.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactsCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test14444", "test2", "newAddress", "1mail", "123456"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().goToHomePage();
  }
}

package ru.stqa.pft.addressbook.tests1.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests1.model.ContactData;

public class ContactModifictionTests extends TestBase {
  @Test
  public void testContactsModification() throws Exception {
    app.getNavigationHelper().goToHomepage();
    app.getContactHelper().initContactModification();

    app.getContactHelper().fillContactModification(new ContactData("newName","newLastName",
            "newAddress","newMail1","7777" ));
  }
}
package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class DeligationContactsTests extends TestBase {

  @Test
  public void testDeligationContacts() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("newFirstname", "newLastname", "NewAddress", "444", "newmail"));
    app.getContactHelper().submitContactCreation();
  }


}
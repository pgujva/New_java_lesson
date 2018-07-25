package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactsCreation() throws Exception {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("testname", "testLastname",
            "testaddress",
            "1111", "222", "333",
            "1testemail", "2testemail", "3testemail",
            "тест1"));
    app.getContactHelper().submitContactCreation();

  }
}

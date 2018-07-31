package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContanctModification(){
    app.getNavigationHelper().goToHomePage();
    if(! app.getContactHelper().isThereContact()) {
      app.getContactHelper().createContact(new ContactData("testname", "testLastname",
              "testaddress",
              "1111", "222", "333",
              "1testemail", "2testemail", "3testemail",
              "тест1"));
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(0);
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("name111", "lastname222","newaddress",
            "44444","45555","7777","newmail1","newmail2","newmail3",null));
    app.getContactHelper().submitContactDelition();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());
  }
}

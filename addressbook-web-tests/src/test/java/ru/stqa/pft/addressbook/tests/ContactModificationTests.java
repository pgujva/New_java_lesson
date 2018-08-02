package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;
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
    app.getContactHelper().selectContact(before.size()- 1);
    app.getContactHelper().initContactModification(before.size()- 1);
    ContactData contact = new ContactData(before.get(before.size()- 1).getId(),"name999", "lastname999","newaddress",
            "44444","45555","7777","newmail1","newmail2","newmail3",null);
    app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() -1);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
  }
}

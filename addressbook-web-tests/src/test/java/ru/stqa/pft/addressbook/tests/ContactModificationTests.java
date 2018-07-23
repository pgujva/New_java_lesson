package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContanctModification(){
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("name111", "lastname222","newaddress",
            "44444","45555","7777","newmail1","newmail2","newmail3",null));
    app.getContactHelper().submitContactDelition();
  }
}

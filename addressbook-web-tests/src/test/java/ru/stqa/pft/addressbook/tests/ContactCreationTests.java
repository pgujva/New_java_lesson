package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactsCreation() throws Exception {
    app.getNavigationHelper().goToHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    ContactData contact = new ContactData("000testname", "000testLastname",
            "testaddress",
            "1111", "222", "333",
            "1testemail", "2testemail", "3testemail",
            "1тест1");
    app.getContactHelper().createContact(contact);
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);

   // int max = 0;
    //for(ContactData c:after) {
      //if (c.getId()>max){
        //max = c.getId();
      //}
    //}
    contact.setId(after.stream().max((o1,o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(contact);
    Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(),g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals( before,after);
  }
}

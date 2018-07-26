package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{

 @Test
  public void testContactDeletion (){
   app.getNavigationHelper().goToHomePage();
   if(! app.getContactHelper().isThereContact()) {
       app.getContactHelper().createContact(new ContactData("testname", "testLastname",
               "testaddress",
               "1111", "222", "333",
               "1testemail", "2testemail", "3testemail",
               "тест1"));
   }
   app.getContactHelper().selectContact();
   app.getContactHelper().deleteContact();
   app.getNavigationHelper().goToHomePage();
 }
}

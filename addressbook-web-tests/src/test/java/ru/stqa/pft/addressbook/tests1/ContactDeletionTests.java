package ru.stqa.pft.addressbook.tests1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    if (app.contact().list().size() == 0) {
      app.contact().create(new ContactData("testname", "testLastname",
              "testaddress",
              "1111", "222", "333",
              "1testemail", "2testemail", "3testemail",
              "тест1"));
    }
  }

  @Test(enabled = false)
  public void testContactDeletion() {
    app.goTo().homePage();
    List<ContactData> before = app.contact().list();
    int index = before.size() - 1;
    app.contact().delete(index);
    app.goTo().homePage();
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(), index);
    before.remove(index);
    Assert.assertEquals(before, after);
  }


}

package ru.stqa.pft.addressbook.tests1.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests1.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactsDeletions() throws Exception {
        app.getNavigationHelper().goToHomepage();

        if (app.getContactHelper().isThereContact1() == true) {
            app.getContactHelper().initContactCreation();
            app.getContactHelper().fillContactForm(new ContactData("test14444", "test2", "newAddress", "1mail", "123456"));
            app.getContactHelper().submitContactCreation();
            app.getContactHelper().returnToHomePage();
        }

        app.getContactHelper().initContactDeletion();
        app.getContactHelper().submitContactDeletion();
        app.getNavigationHelper().goToHomepage();
    }
}

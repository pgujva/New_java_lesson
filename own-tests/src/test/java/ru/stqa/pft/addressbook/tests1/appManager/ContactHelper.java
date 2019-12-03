package ru.stqa.pft.addressbook.tests1.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.tests1.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(ChromeDriver wd) {
        super(wd);
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getMail1());
        type(By.name("home"), contactData.getHomePhone());
        if(creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
        Assert.assertFalse(isElementPresent(By.name("new_group")));

        }
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void initContactDeletion() {
        wd.findElement(By.id("284")).click();
    }

    public void submitContactDeletion() {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void initContactModification() {
        wd.findElement(By.xpath("xpath=(//img[@alt='Edit'])[3]")).click();
    }

    public void fillContactModification(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getMail1());
        type(By.name("home"), contactData.getHomePhone());
    }




    public boolean isThereContact() {
        return isElementPresent(By.name("entry"));
    }


}

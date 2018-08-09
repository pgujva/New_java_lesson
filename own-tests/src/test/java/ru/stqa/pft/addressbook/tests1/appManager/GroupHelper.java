package ru.stqa.pft.addressbook.tests1.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.tests1.model.GroupData;

public class GroupHelper extends HelperBase{


  public GroupHelper(ChromeDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"),groupData.getGroupName());
    type(By.name("group_name"),groupData.getGroupName());
    type(By.name("group_header"),groupData.getHeader());
    type(By.name("group_footer"),groupData.getFooter());
  }

  public void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }
}

package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import static org.testng.Assert.fail;

public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {
      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().initGroupCreation();
      app.getGroupHelper().fillGroupForm(new GroupData("тест1", "тест2", "тест3"));
      app.getGroupHelper().submitGroupCreation();
      app.getGroupHelper().returnToGroupPage();
  }

}


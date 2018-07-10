package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import static org.testng.Assert.fail;

public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {
      app.gotoGroupPage();
      app.initGroupCreation();
      app.fillGroupForm(new GroupData("тест1", "тест2", "тест3"));
      app.submitGroupCreation();
      app.returnToGroupPage();
  }


}


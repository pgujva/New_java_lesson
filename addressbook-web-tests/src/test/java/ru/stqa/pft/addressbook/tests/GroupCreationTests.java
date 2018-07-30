package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import static org.testng.Assert.fail;

public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {
    int before=app.getGroupHelper().getGroupCount();
      app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("тест1", "тест2", "тест3"));
    int after=app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before + 1);
  }

}


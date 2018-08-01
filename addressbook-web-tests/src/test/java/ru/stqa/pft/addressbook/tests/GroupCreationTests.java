package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

import static org.testng.Assert.fail;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before=app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("тест1", "тест2", "тест3"));
    List<GroupData> after=app.getGroupHelper().getGroupList();
    for(GroupData a: after) {
      System.out.println(a);
    }
    Assert.assertEquals(after.size(), before.size() + 1);
  }

}


package ru.stqa.pft.addressbook.tests1;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

import static org.testng.Assert.fail;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    app.goTo().groupPage();
    List<GroupData> before=app.group().list();
    GroupData group = new GroupData("test1","test2","test3");
    app.group().create(group);
    List<GroupData> after=app.group().list();
    Assert.assertEquals(after.size(), before.size() + 1);

   // int max = 0;
     //   for (GroupData g:after) {
       //   if (g.getId()> max) {
        //    max = g.getId();
      //}
    //}

    before.add(group);
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(),g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals( before,after);
  }

}


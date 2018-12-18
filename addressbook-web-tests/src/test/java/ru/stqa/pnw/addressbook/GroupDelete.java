package ru.stqa.pnw.addressbook;

import org.testng.annotations.Test;

public class GroupDelete extends TestBase {

  @Test
  public void testGroupDelete() throws Exception {
   goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }


}

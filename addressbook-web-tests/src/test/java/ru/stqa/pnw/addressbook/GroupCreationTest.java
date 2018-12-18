package ru.stqa.pnw.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

  @Test
  public void testUntitledTestCase() throws Exception {

    goToGroupPage();
    initGroupCreation();
    fillGroupForm("test1", "test2", "test3");
    submitGroupCreation();
    returnToGroupPage();
  }

}

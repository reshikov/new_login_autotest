package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by reshikov on 05.06.17.
 */
public class GroupModificationTests extends TestBase {

    @Test

    public void testGroupModification () {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initToGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test new 1", "test new 3", "test new 4"));
        app.getGroupHelper().updateGroup();
        app.getGroupHelper().returnToGroupPage();


    }


}

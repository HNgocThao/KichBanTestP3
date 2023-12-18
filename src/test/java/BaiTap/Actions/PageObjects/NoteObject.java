package BaiTap.Actions.PageObjects;

import BaiTap.Interfaces.NoteUI;
import ThucHanh.Actions.Commons.BasePage;
import org.openqa.selenium.WebDriver;

public class NoteObject {
    private static BasePage basePage = new BasePage();

    public static void AddNote(WebDriver driver, String title) {
        basePage.isElementDisplayed(driver, NoteUI.Task_show);
        basePage.clickToElement(driver, NoteUI.Cross_btn);
        basePage.clickToElement(driver, NoteUI.AddNote_btn);
        basePage.sendKeyToElement(driver, NoteUI.Title_txb, title);
        basePage.clickToElement(driver, NoteUI.Save_btn);
        basePage.clickToElement(driver, NoteUI.Close_btn);
    }
}

package BaiTap.Actions.PageObjects;

import BaiTap.Interfaces.EventUI;
import ThucHanh.Actions.Commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EventObject {
    private static BasePage basePage = new BasePage();

    public static void AddEvent(WebDriver driver, String title, String start_date) {
        basePage.isElementDisplayed(driver, EventUI.Task_show);
        basePage.clickToElement(driver, EventUI.Cross_btn);
        basePage.clickToElement(driver, EventUI.AddEvent_btn);
        basePage.sendKeyToElement(driver, EventUI.Title_txb, title);
        basePage.sendKeyToElement(driver, EventUI.Start_date_txb, start_date);
        basePage.clickToElement(driver, EventUI.Save_btn);
        basePage.clickToElement(driver, EventUI.Close_btn);
    }
}

package BaiTap.Actions.PageObjects;

import BaiTap.Interfaces.TicketUI;
import ThucHanh.Actions.Commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TicketObject {
    private static BasePage basePage = new BasePage();

    public static void AddTask(WebDriver driver, String title, String client, String description) {
        basePage.isElementDisplayed(driver, TicketUI.Task_show);
        basePage.clickToElement(driver, TicketUI.Cross_btn);
        basePage.clickToElement(driver, TicketUI.AddTicket_btn);
        basePage.sendKeyToElement(driver, TicketUI.Title_txb, title);
        basePage.clickToElement(driver, TicketUI.Client_txt);
        basePage.sendKeyToEnter(driver, TicketUI.Client_txt2, client);
        basePage.clickToElement(driver, TicketUI.Description_area);
        basePage.sendKeyToElement(driver, TicketUI.Description_area2, description);
        basePage.clickToElement(driver, TicketUI.Save_btn);
        basePage.clickToElement(driver, TicketUI.Close_btn);
    }
}

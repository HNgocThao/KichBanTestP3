package BaiTap.Actions.PageObjects;

import BaiTap.Interfaces.TodoUI;
import ThucHanh.Actions.Commons.BasePage;
import org.openqa.selenium.WebDriver;

public class TodoObject {
    private static BasePage basePage = new BasePage();

    public static void AddTodo(WebDriver driver, String title) {
        basePage.isElementDisplayed(driver, TodoUI.Task_show);
        basePage.clickToElement(driver, TodoUI.Cross_btn);
        basePage.clickToElement(driver, TodoUI.AddTodo_btn);
        basePage.sendKeyToElement(driver, TodoUI.Title_txb, title);
        basePage.clickToElement(driver, TodoUI.Save_btn);
        basePage.clickToElement(driver, TodoUI.Close_btn);
    }
}

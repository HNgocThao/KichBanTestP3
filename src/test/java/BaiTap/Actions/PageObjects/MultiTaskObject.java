package BaiTap.Actions.PageObjects;

import BaiTap.Interfaces.MultipleTasksUI;
import ThucHanh.Actions.Commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MultiTaskObject {
    private static BasePage basePage = new BasePage();

    public static void AddMultiTask(WebDriver driver, String title, String project) {
        basePage.isElementDisplayed(driver, MultipleTasksUI.Task_show);
        basePage.clickToElement(driver, MultipleTasksUI.Cross_btn);
        basePage.clickToElement(driver, MultipleTasksUI.AddMultiTask_btn);
        basePage.sendKeyToElement(driver, MultipleTasksUI.Title_txb, title);
        basePage.clickToElement(driver, MultipleTasksUI.Project_txt);
        basePage.sendKeyToEnter(driver, MultipleTasksUI.Project_txt2, project);
        basePage.clickToElement(driver, MultipleTasksUI.Save_btn);
        basePage.clickToElement(driver, MultipleTasksUI.Close_btn);
    }
}

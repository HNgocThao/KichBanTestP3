package BaiTap.Actions.PageObjects;

import BaiTap.Interfaces.TaskUI;
import ThucHanh.Actions.Commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TaskObject {
    private static BasePage basePage = new BasePage();

    public static void AddTask(WebDriver driver, String title, String project) {
        basePage.isElementDisplayed(driver, TaskUI.Task_show);
        basePage.clickToElement(driver, TaskUI.Cross_btn);
        basePage.clickToElement(driver, TaskUI.AddTask_btn);
        basePage.sendKeyToElement(driver, TaskUI.Title_txb, title);
        basePage.clickToElement(driver, TaskUI.Project_txt);
        basePage.sendKeyToEnter(driver, TaskUI.Project_txt2, project);
        basePage.clickToElement(driver, TaskUI.Save_btn);
        basePage.clickToElement(driver, TaskUI.Close_btn);
    }
}

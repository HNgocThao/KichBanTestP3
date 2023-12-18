package BaiTap.Actions.PageObjects;

import BaiTap.Interfaces.ProjectTimeUI;
import ThucHanh.Actions.Commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProjectTimeObject {
    private static BasePage basePage = new BasePage();

    public static void AddProjectTime(WebDriver driver, String project, String start_date,
                               String start_time, String end_date, String end_time) {
        basePage.isElementDisplayed(driver, ProjectTimeUI.Task_show);
        basePage.clickToElement(driver, ProjectTimeUI.Cross_btn);
        basePage.clickToElement(driver, ProjectTimeUI.AddProject_btn);
        basePage.clickToElement(driver, ProjectTimeUI.Project_drop);
        basePage.sendKeyToEnter(driver, ProjectTimeUI.Project_drop2, project);
        basePage.sendKeyToElement(driver, ProjectTimeUI.Start_date_txb, start_date);
        basePage.sendKeyToElementClick(driver, ProjectTimeUI.Start_time_txb, start_time);
        basePage.sendKeyToElementClick(driver, ProjectTimeUI.End_date_txb, end_date);
        basePage.sendKeyToElementClick(driver, ProjectTimeUI.End_time_txb, end_time);
        basePage.clickToElement(driver, ProjectTimeUI.Save_btn);
        basePage.clickToElement(driver, ProjectTimeUI.Close_btn);
    }
}

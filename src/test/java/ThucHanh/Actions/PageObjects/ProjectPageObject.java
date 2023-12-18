package ThucHanh.Actions.PageObjects;

import ThucHanh.Actions.Commons.BasePage;
import ThucHanh.Interfaces.ProjectPageUI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProjectPageObject {
    private static BasePage basePage = new BasePage();

    public static void EditProject(WebDriver driver, String title, String project, String client, String area,
                                   String date, String deadline, String price, String label, String status){
        basePage.clickToElement(driver, ProjectPageUI.ProjectPage_txt);
        basePage.isElementDisplayed(driver, ProjectPageUI.Project_show);
        basePage.clickToElement(driver, ProjectPageUI.AllProject_btn);
        basePage.waitForElementVisible(driver, ProjectPageUI.EditProject_btn);
        basePage.clickToElement(driver, ProjectPageUI.EditProject_btn);
        basePage.waitForElementVisible(driver, ProjectPageUI.Title_txt);
        basePage.sendKeyToElement(driver, ProjectPageUI.Title_txt, title);
        basePage.clickToElement(driver, ProjectPageUI.Project_drop);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Project_drop2, project);
        if(basePage.isElementDisplayed(driver,ProjectPageUI.Client_drop)){
            basePage.clickToElement(driver, ProjectPageUI.Client_drop);
            basePage.sendKeyToEnter(driver, ProjectPageUI.Client_drop2, client);
        }
        basePage.sendKeyToElement(driver, ProjectPageUI.Description_area, area);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Start_date_txt, date);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Deadline_txt, deadline);
        basePage.sendKeyToElementClick(driver, ProjectPageUI.Price_txt, price);
//        basePage.sendKeyToEnter(driver, ProjectPageUI.Label_list, label);
        basePage.clickToElement(driver, ProjectPageUI.Status_List);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Status_List2, status);
        basePage.clickToElement(driver, ProjectPageUI.Save_btn2);
        basePage.clickToElement(driver, ProjectPageUI.Close_btn2);
    }

    public static void DeleteProject(WebDriver driver){
        basePage.clickToElement(driver, ProjectPageUI.DeleteProject_btn);
        basePage.waitForElementVisible(driver, ProjectPageUI.Delete_btn);
        basePage.clickToElement(driver, ProjectPageUI.Delete_btn);
    }

    public static void FilterProject(WebDriver driver, String open){
        basePage.waitForElementVisible(driver, ProjectPageUI.AllProject_btn2);
        basePage.clickToElement(driver, ProjectPageUI.AllProject_btn2);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Open_txt, open);
    }
    public static void PrintProject(WebDriver driver){

        basePage.waitForElementVisible(driver, ProjectPageUI.Print_btn);
        basePage.clickToElement(driver, ProjectPageUI.Print_btn);
        driver.switchTo().defaultContent();
    }
    public static void ExcelProject(WebDriver driver){
//        driver.switchTo().activeElement().sendKeys("aa");
//        ChromeOptions options = new ChromeOptions();
//    // Set the download directory
//        options.addArguments("download.default_directory=Desktop");
//    // Disable the download popup
//        options.addArguments("download.prompt_for_download=false");
//
//                WebDriver drivers = new ChromeDriver(options);
        basePage.clickToElement(driver, ProjectPageUI.Excel_btn);
    }
}

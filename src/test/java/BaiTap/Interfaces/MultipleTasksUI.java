package BaiTap.Interfaces;

public class MultipleTasksUI {
    public static String Task_show = "//h4[text()='Tasks']";
    public static String Cross_btn = "//a[@id='quick-add-icon']";
    public static String AddMultiTask_btn = "//a[text()='Add multiple tasks']";

    public static String Title_txb = "//label[text()='Title']//following::input[@id='title']";
    public static String Project_txt = "//label[text()='Project']/following::span[text()='Project']";
    public static String Project_txt2 = "//label[text()='Project']//following-sibling::input[@role='combobox']";
    public static String Save_btn = "//button[@id=\"save-and-add-button\"]";
    public static String Close_btn = "//button[text()=\" Close\"]";
}

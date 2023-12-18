package BaiTap.Interfaces;

public class ProjectTimeUI {
    public static String Task_show = "//h4[text()='Tasks']";
    public static String Cross_btn = "//a[@id='quick-add-icon']";
    public static String AddProject_btn = "//a[text()=\"Add project time\"]";

    public static String Project_drop = "(//a[@href='javascript:void(0)'])[8]";
    public static String Project_drop2 = "//label[text()='Project']//following-sibling::input[@type='text' and @role='combobox']";
    public static String Start_date_txb = "//input[@name='start_date']";
    public static String Start_time_txb = "//input[@name='start_time']";
    public static String End_date_txb = "//input[@name='end_date']";
    public static String End_time_txb = "//input[@name='end_time']";
    public static String Save_btn = "//button[text()=\" Save\"]";
    public static String Close_btn = "//button[text()=\" Close\"]";
}

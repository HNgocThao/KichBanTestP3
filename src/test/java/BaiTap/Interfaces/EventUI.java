package BaiTap.Interfaces;

public class EventUI {
    public static String Task_show = "//h4[text()='Tasks']";
    public static String Cross_btn = "//a[@id='quick-add-icon']";
    public static String AddEvent_btn = "//a[text()='Add event']";

    public static String Title_txb = "//label[text()='Title']//following::input[@id='title']";
    public static String Start_date_txb = "//input[@name='start_date']";
    public static String Save_btn = "//button[@type='submit']";
    public static String Close_btn = "//button[text()=\" Close\"]";
}

package BaiTap.Interfaces;

public class TicketUI {
    public static String Task_show = "//h4[text()='Tasks']";
    public static String Cross_btn = "//a[@id='quick-add-icon']";
    public static String AddTicket_btn = "//a[text()='Add ticket']";

    public static String Title_txb = "//label[text()='Title']//following::input[@id='title']";
    public static String Client_txt = "(//label[text()='Client']//following::a[@href='javascript:void(0)'])[1]";
    public static String Client_txt2 = "//div[@class=\"modal fade\"]//following::input[@aria-autocomplete=\"list\"]";
    public static String Description_area = "//textarea";
    public static String Description_area2 = "//div[@class='note-editable']";
    public static String Save_btn = "//button[@type='submit']";
    public static String Close_btn = "//button[text()=\" Close\"]";
}

package ThucHanh.Interfaces;

public class ProjectPageUI {

    public static String ProjectPage_txt = "//a[@href='https://rise.fairsketch.com/projects/all_projects']";
    public static String Project_show = "//h1";

    //Edit
    public static String AllProject_btn = "//button[@data-id=\"ecmkusuchl\"]";
    public static String EditProject_btn = "(//a[@title='Edit project'])[1]";
    public static String Title_txt = "//input[@name=\"title\"]";
    public static String Project_drop = "(//a[@href='javascript:void(0)'])[3]";
    public static String Project_drop2 = "(//input[@type='text' and @role='combobox'])[5]";
    public static String Client_drop = "(//a[@href='javascript:void(0)'])[4]";
    public static String Client_drop2 = "(//input[@type='text' and @role='combobox'])[5]";
    public static String Description_area = "//div[@role='textbox']";
    public static String Start_date_txt = "//input[@name='start_date']";
    public static String Deadline_txt = "//input[@name='deadline']";
    public static String Price_txt = "//input[@name='price']";
    public static String Label_list = "//label[text()='Labels']//following-sibling::input";
    public static String Status_List = "//label[text()='Status']//following::a[@href='javascript:void(0)']";
    public static String Status_List2 = "(//input[@type='text' and @role='combobox'])[5]";
    public static String Save_btn2 = "//button[text()=\" Save\"]";
    public static String Close_btn2 = "//button[text()=\" Close\"]";

    //Delete
    public static String DeleteProject_btn = "(//a[@title='Delete project'])[2]";
    public static String Delete_btn = "//button[@id='confirmDeleteButton']";

    //Filter
    public static String AllProject_btn2 = "(//button[text()=\"All projects\"])[1]";
    public static String Open_txt = "(//input[@placeholder='Search'])[1]";

    //Print
    public static String Print_btn = "//span[text()='Print']";

    //Excel
    public static String Excel_btn = "//span[text()='Excel']";

}

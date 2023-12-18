package ThucHanh.TestCases;

import ThucHanh.Actions.Commons.BaseTest;
import ThucHanh.Actions.PageObjects.LoginPageObject;
import ThucHanh.Actions.PageObjects.LogoutPageObject;
import ThucHanh.Actions.PageObjects.ProjectPageObject;
import ThucHanh.Utilities.Listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;


@Listeners({TestListener.class})
public class TC01_TestProject extends BaseTest {
    private static WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver = getDriver();
    }

    @Test(priority = 0)
    public void Test_Login() {
        LoginPageObject.Login(driver, "admin@demo.com", "riseDemo");
    }

    @Test (priority = 1, dataProvider = "RISE_Login", dataProviderClass = ThucHanh.Utilities.Helpers.PropertiesFile.class)
    public void Test_EditProject(HashMap<String, String> data){
        ProjectPageObject.EditProject(driver, data.get("title"), data.get("project"),
                data.get("client"), data.get("area"),data.get("date"), data.get("deadline"),
                data.get("price"), data.get("label"), data.get("status"));
    }
    @Test (priority = 2)
    public void Test_DeleteProject() {
        ProjectPageObject.DeleteProject(driver);
    }
    @Test (priority = 3, dataProvider = "RISE_Login", dataProviderClass = ThucHanh.Utilities.Helpers.PropertiesFile.class)
    public void Test_FilterProject(HashMap<String, String> data){
        ProjectPageObject.FilterProject(driver, data.get("open"));
    }
    @Test (priority = 4)
    public void Test_PrintProject() {
        ProjectPageObject.PrintProject(driver);
    }
    @Test (priority = 5)
    public void Test_ExcelProject() {
        ProjectPageObject.ExcelProject(driver);
    }
    @Test (priority = 6)
    public void Test_Logout() {
        LogoutPageObject.Logout(driver);
    }

    @AfterClass
    public void afterClass() throws Exception{
        tearDown();
    }
}

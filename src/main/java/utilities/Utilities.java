package utilities;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Utilities {
    public static WebDriver driver;
    public static void setUtilityDriver(){
        driver = BasePage.driver;
    }

}

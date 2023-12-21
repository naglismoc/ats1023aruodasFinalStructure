import org.example.Helper;
import org.example.models.Plot;
import org.example.models.SearchRE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlotTests {
    static WebDriver driver;


//    @Test
//    public void positiveTest(){
//        Plot p = new Plot();
//        p.fill();
//    }

    @Test
    public void positiveSearch(){
        Plot p = new Plot("Kaunas","Kauno","senamiestis","ryto","Butai nuomotis",new String[]{"photo1","photo2"},"ieskau buto","www.youtube.com","www.tour3d.com","40000","+37065897845","email@as.com","","",new String[]{"","",""});
        p.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }


    @BeforeClass
    public void beforeClass(){
        Helper.setUp();
        driver = Helper.driver;
    }


    @BeforeMethod
    public void getWebsite(){
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11");
    }

    @AfterClass
    public void afterClass(){
//        driver.quit();
    }
}

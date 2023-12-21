import org.example.Helper;
import org.example.models.SearchRE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class SearchRETets {
        static WebDriver driver;

    @Test
    public void positiveSearch(){
        SearchRE sre = new SearchRE("Kaunas","Kauno","senamiestis","ryto","Butai nuomotis",new String[]{"photo1","photo2"},"ieskau buto","www.youtube.com","www.tour3d.com","40000","+37065897845","email@as.com");
        sre.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }

    @Ignore
    @Test
    public void adNoObjectTypeTest(){
        SearchRE sre = new SearchRE("Kaunas","Kauno","senamiestis","ryto","",new String[]{"photo1","photo2"},"ieskau buto","www.youtube.com","www.tour3d.com","40000","+37065897845","email@as.com");
        sre.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }

    @Ignore
    @Test
    public void adNoDescriptionTest(){
        SearchRE sre = new SearchRE("Kaunas","Kauno","senamiestis","ryto","Butai nuomotis",new String[]{"photo1","photo2"},"www.youtube.com","www.tour3d.com","40000","+37065897845","email@as.com","namu ukio");
        sre.fill();
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
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=10");
    }

    @AfterClass
    public void afterClass(){
//        driver.quit();
    }
}

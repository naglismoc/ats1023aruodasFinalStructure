package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchRE extends RealEstate{
    public String objectType;

    public SearchRE(String region, String district, String quartal, String street, String description, String[] photos, String youtube, String tour3d, String price, String phoNo, String email, String objectType) {
        super(region, district, quartal, street, description, photos, youtube, tour3d, price, phoNo, email);
        this.objectType = objectType;
    }

    @Override
    public void fill(){
        super.fill();
        fillObjectType();
        submit();
    }
    public void fillObjectType(){
    driver.findElement(By.xpath(""));
    }
}

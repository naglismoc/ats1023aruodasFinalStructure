package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RealEstate {

    public static WebDriver driver;

    public String region;
    public String district;
    public String quartal;
    public String street;
    public String description;
    public String[] photos;
    public String youtube;
    public String tour3d;
    public String price;
    public String phoNo;
    public String email;

    public RealEstate(String region, String district, String quartal, String street, String description, String[] photos, String youtube, String tour3d, String price, String phoNo, String email) {
        this.region = region;
        this.district = district;
        this.quartal = quartal;
        this.street = street;
        this.description = description;
        this.photos = photos;
        this.youtube = youtube;
        this.tour3d = tour3d;
        this.price = price;
        this.phoNo = phoNo;
        this.email = email;
    }


    public void fill(){
        fillLocation();
        fillDescription();
        uploadPhotos();
        fillYoutube();
        fillTour3d();
        fillPrice();
        fillPhoNo();
        fillEmail();
        fill3BottomCheckboxes();
    }

    public void submit(){

    }
    public void fillRegion(){
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"regionDropdown\"]/li[2]")).click();
    }
    public void fillDistrict(){
        driver.findElement(By.xpath("//*[@id=\"district\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"districts_461\"]/li[2]")).click();
    }
    public void fillQuartal(){
        driver.findElement(By.xpath("//*[@id=\"quartalField\"]/span[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"quartals_1\"]/li[2]")).click();
    }
    public void fillStreet(){
        driver.findElement(By.xpath("//*[@id=\"streetField\"]/span[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"streets_1\"]/li[2]")).click();
    }
    public void fillLocation(){
        fillRegion();
        fillDistrict();
        fillQuartal();
        fillStreet();
    }



    public void fillDescription(){

    }
    public void uploadPhotos(){

    }
    public void fillYoutube(){

    }
    public void fillTour3d(){

    }
    public void fillPrice(){

    }
    public void fillPhoNo(){

    }
    public void fillEmail(){

    }
    public void fill3BottomCheckboxes() {
    }
}

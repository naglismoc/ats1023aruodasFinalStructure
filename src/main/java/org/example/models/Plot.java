package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Plot extends RealEstate{
    public String addressNo;
    public String rcNo;
    public String area;
    public String[] purposes;

    public Plot(String region, String district, String quartal, String street, String description, String[] photos, String youtube, String tour3d, String price, String phoNo, String email, String addressNo, String rcNo, String area, String[] purposes) {
        super(region, district, quartal, street, description, photos, youtube, tour3d, price, phoNo, email);
        this.addressNo = addressNo;
        this.rcNo = rcNo;
        this.area = area;
        this.purposes = purposes;
    }

    @Override
    public void fill(){
        super.fill();
        setArea();
        setAddressNo();
        setPurposes();
        setRcNo();
        submit();
    }

    public void setAddressNo( ) {
    }

    public void setRcNo( ) {
    }

    public void setArea( ) {
    }

    public void setPurposes() {
    }
}

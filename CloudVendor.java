package com.thinkconstructive.restdemo.model;

public class CloudVendor {



    private String vendorID;
    private String vendorName;

    private String VendorAddress;
    private String VendorPhoneNumber;


    public CloudVendor() {
    }

    public CloudVendor(String vendorID , String vendorName, String vendorAddress , String vendorPhoneNumber)
    {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.VendorAddress = vendorAddress;
        this.VendorPhoneNumber = vendorPhoneNumber;

    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }
}

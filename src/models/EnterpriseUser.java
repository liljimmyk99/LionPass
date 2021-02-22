package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EnterpriseUser extends User{
    private String licenseNumber;
    private String companyName;
    private String companyPhoneNumber;
    private Address companyBillingAddress;

    public EnterpriseUser(String firstName, String lastName, int age, Address address, ArrayList<Credential> storeCredentials, Credential logInInfo){
        super(firstName, lastName, age, address, storeCredentials, logInInfo);
        super.setAccountType("ENTERPRISE");
    }

    public EnterpriseUser(String firstName, String lastName, int age, Address address,
            ArrayList<Credential> storeCredentials, Credential logInInfo,
            String licenseNumber, String companyName, String companyPhoneNumber, Address companyBillingAddress) {
        super(firstName, lastName, age, address, storeCredentials, logInInfo);
        super.setAccountType("ENTERPRISE");
        this.licenseNumber = licenseNumber;
        this.companyName = companyName;
        this.companyPhoneNumber = companyPhoneNumber;
        this.companyBillingAddress = companyBillingAddress;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public Address getCompanyBillingAddress() {
        return companyBillingAddress;
    }

    public void setCompanyBillingAddress(Address companyBillingAddress) {
        this.companyBillingAddress = companyBillingAddress;
    }

    @Override
    public String toString() {
        return  super.toString() + " EnterpriseUser [companyBillingAddress=" + companyBillingAddress.toString() + ", companyName=" + companyName
                + ", companyPhoneNumber=" + companyPhoneNumber +  ", licenseNumber="
                + licenseNumber + "]";
    }

    @Override
    public void billUser(){
        System.out.println("billUser function activated");

        Address billingAddress = getCompanyBillingAddress();

        //Sends Bill to billingAddress

        System.out.println("Sending Bill to Enterpise User's Company: " + billingAddress.toString());
    }
    
}

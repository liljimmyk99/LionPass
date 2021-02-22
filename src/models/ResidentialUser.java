package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ResidentialUser extends User{
    private LocalDateTime freeUntilDate;
    private int licensesAvailable;
    private boolean premiumMembershipActive;
    private String phoneNumber;
    private String licenseNumber;



    public ResidentialUser(String firstName, String lastName, int age, Address address, ArrayList<Credential> storeCredentials, Credential logInInfo){
        super(firstName, lastName, age, address, storeCredentials, logInInfo);
        super.setAccountType("RESIDENTIAL");
    }

    public ResidentialUser(String firstName, String lastName, int age, Address address,
            ArrayList<Credential> storeCredentials, Credential logInInfo, LocalDateTime freeUntilDate,
            int licensesAvailable, boolean premiumMembershipActive, String phoneNumber, String licenseNumber) {
        super(firstName, lastName, age, address, storeCredentials, logInInfo);
        this.freeUntilDate = freeUntilDate;
        this.licensesAvailable = licensesAvailable;
        this.premiumMembershipActive = premiumMembershipActive;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
    }

    public LocalDateTime getFreeUntilDate() {
        return freeUntilDate;
    }

    public void setFreeUntilDate(LocalDateTime freeUntilDate) {
        this.freeUntilDate = freeUntilDate;
    }

    public int getLicensesAvailable() {
        return licensesAvailable;
    }

    public void setLicensesAvailable(int licensesAvailable) {
        this.licensesAvailable = licensesAvailable;
    }

    public boolean isPremiumMembershipActive() {
        return premiumMembershipActive;
    }

    public void setPremiumMembershipActive(boolean premiumMembershipActive) {
        this.premiumMembershipActive = premiumMembershipActive;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return  super.toString() + "ResidentialUser [freeUntilDate=" + freeUntilDate + ", licenseNumber=" + licenseNumber
                + ", licensesAvailable=" + licensesAvailable + ", phoneNumber=" + phoneNumber
                + ", premiumMembershipActive=" + premiumMembershipActive + "]";
    }

    @Override
    public void billUser(){
        System.out.println("billUser function activated");

        Address billingAddress = super.getAddress();

        //Sends Bill to billingAddress

        System.out.println("Sending Bill to Residential User's address: " + billingAddress.toString());
    }
    
}

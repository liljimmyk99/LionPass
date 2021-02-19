package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EnterpriseUser extends User{
    private LocalDateTime freeUntilDate;
    private String licenseNumber;
    private String companyName;
    private String companyPhoneNumber;
    private Address companyBillingAddress;

    public EnterpriseUser(String firstName, String lastName, int age, Address address, ArrayList<Credential> storeCredentials, Credential logInInfo){
        super(firstName, lastName, age, address, storeCredentials, logInInfo);
        super.setAccountType("ENTERPRISE");
    }
}

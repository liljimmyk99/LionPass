package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ResidentialUser extends User{
    private LocalDateTime freeUntilDate;
    private int licensesAvailable;
    private boolean premiumMembershipActive;
    private String phoneNumber;



    public ResidentialUser(String firstName, String lastName, int age, Address address, ArrayList<Credential> storeCredentials, Credential logInInfo){
        super(firstName, lastName, age, address, storeCredentials, logInInfo);
        super.setAccountType("RESIDENTIAL");
    }
    
}

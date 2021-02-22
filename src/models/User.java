package models;

import java.util.*;

public class User{
    //Represents an actual user
    private String firstName;
    private String lastName;
    private String accountType;
    //Used for Password Generation vvvvvv
    private int age;
    private Address address;
    private Credential logInInfo;
    private ArrayList<Credential> storedCrednetials;

    public User(){
        
    }

    public User(String firstName, String lastName, int age, Address address, ArrayList<Credential> storeCredentials, Credential logInInfo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.storedCrednetials = storeCredentials;
        this.logInInfo = logInInfo;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public ArrayList<Credential> getStoredCrednetials() {
        return storedCrednetials;
    }
    public void setStoredCrednetials(ArrayList<Credential> storedCrednetials) {
        this.storedCrednetials = storedCrednetials;
    }
    public void addCredential(Credential newCreds){
        storedCrednetials.add(newCreds);
    }
    public boolean checkLogin(String userName, String password){
        System.out.println("checkLogin activated");
        System.out.println("Username Parameter: '" + userName + "' Password Parameter: '" + password +"'");
        String correctUserName = logInInfo.getUserName();
        String correctPassWord = logInInfo.getPassword().getValue();
        System.out.println("Correct Username: '" + correctUserName + "' Correct Password: '" + correctPassWord +"'");
        if((correctUserName).equals(userName) && (correctPassWord).equals(password)){
            return true;
        }
        //If not this doesn't work
        return false;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age +", accountType=" + accountType + ", address=" + address + "]";
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void billUser(){
        System.out.println("billUser Function activated");

        System.out.println("Error, Unable to decide user type");
    }



    
}
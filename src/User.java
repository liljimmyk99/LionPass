import java.util.*;

public class User{
    //Represents an actual user
    private String firstName;
    private String lastName;
    //Used for Password Generation vvvvvv
    private int age;
    private String cityLocation;
    private String stateLocation;
    private String zipCode;

    private ArrayList<Credential> storedCrednetials;

    public User(String firstName, String lastName, int age, String cityLocation, String stateLocation, String zipcode, ArrayList<Credential> storeCredentials){
        storedCrednetials = new ArrayList<Credential>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cityLocation = cityLocation;
        this.stateLocation = stateLocation;
        this.zipCode = zipcode;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCityLocation() {
        return cityLocation;
    }
    public void setCityLocation(String cityLocation) {
        this.cityLocation = cityLocation;
    }
    public String getStateLocation() {
        return stateLocation;
    }
    public void setStateLocation(String stateLocation) {
        this.stateLocation = stateLocation;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public ArrayList<Credential> getStoredCrednetials() {
        return storedCrednetials;
    }
    public void setStoredCrednetials(ArrayList<Credential> storedCrednetials) {
        this.storedCrednetials = storedCrednetials;
    }
    public void addStoredCredential(Credential newCreds){
        storedCrednetials.add(newCreds);
    }

}
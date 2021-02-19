package models;

public class Address {
    private String street;
    private String city;
    private String apartment;
    private String state;
    private String zipcode;
    private String country;

    public Address(String street, String city, String apartment, String state, String zipcode, String country) {
        this.street = street;
        this.city = city;
        this.apartment = apartment;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        if (apartment.equals(null)){
            return "Address [street=" + street +", city=" + city + ", state=" + state
             +", zipcode=" + zipcode + ", country=" + country + "]";
        }
        else{
            return "Address [street=" + street + "apartment=" + apartment + ", city=" + city + ", state=" + state
            +", zipcode=" + zipcode + ", country=" + country + "]";
        }
    }

    public Address(String street, String city, String state, String zipcode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }
    
}

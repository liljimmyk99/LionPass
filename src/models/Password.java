package models;

public class Password{

    private String passwordValue;
    private boolean userCreated;
    private boolean specialCharacters;
    private boolean numberCharacters;
    private boolean easyToRead;


    public Password(String userSuppliedPassword){
        passwordValue = userSuppliedPassword;
        userCreated = true;
    }
    public Password(boolean specialCharacters, boolean numberCharacters, boolean easyToRead){
        userCreated = false;
        this.specialCharacters = specialCharacters;
        this.numberCharacters = numberCharacters;
        this.easyToRead = easyToRead;
    }
    public String generateNewPassword(){
        //Eventually will generate Password
        
        this.passwordValue = "";
        return "";
    }
    public String getValue(){
        return passwordValue;
    }
    //There should be no way set value until it was done so at creation
    
    public void encrypt(){
        //algorithm to encrypt passwordValue
    }

    public String decrypt(){
        //algorithm to decrypt passwordValue
        return "";
    }
    @Override
    public String toString(){
        return "Value:" + getValue() + ", User Generated:" + this.userCreated + ", Number Chars:" + this.numberCharacters + ", Easy to Read:" + this.numberCharacters;
    }



}
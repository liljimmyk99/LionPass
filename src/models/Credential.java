package models;

import java.io.File;

public class Credential{
    private String userName;
    //private Password password;
    private String password;
    //private Resource resource;
    private String resource;
    private String description;
    private File icon; 

    public Credential(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public Credential(String userName, String password, String resource, String description){
        this.userName = userName;
        this.password = password;
        this.resource = resource;
        this.description = description;
    }
    public Credential(String userName, String password, String resource, String description, File icon){
        this.userName = userName;
        this.password = password;
        this.resource = resource;
        this.description = description;
        this.icon = icon;
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public File getIcon() {
        return icon;
    }
    public void setIcon(File icon) {
        this.icon = icon;
    }



 
    




}
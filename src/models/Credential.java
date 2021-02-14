package models;

import java.io.File;

public class Credential{
    private String userName;
    private Password password;
    private Resource resource;
    private String description;
    private File icon; 

    public Credential(String userName, Password password){
        this.userName = userName;
        this.password = password;
    }

    public Credential(String userName, Password password, Resource resource, String description){
        this.userName = userName;
        this.password = password;
        this.resource = resource;
        this.description = description;
    }
    public Credential(String userName, Password password, Resource resource, String description, File icon){
        this.userName = userName;
        this.password = password;
        this.resource = resource;
        this.description = description;
        this.icon = icon;
    }

    public String getUserName() {
        return userName;
    }
    public Password getPassword() {
        return password;
    }
    public Resource getResource() {
        return resource;
    }
    public void setResource(Resource resource) {
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
    @Override
    public String toString(){
        return "UserName:" + getUserName() + ", Description:" + getDescription() + "\n Resource: {" + getResource().toString() + "} \n Password: {" + getPassword().toString() + "}";
    }



 
    




}
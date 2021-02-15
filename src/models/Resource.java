package models;

import java.time.LocalDateTime;


public class Resource{
    private String name;
    private String url;
    private boolean webApp;
    private LocalDateTime creation;



    public Resource(String name, String url, boolean webApp, LocalDateTime creation){
        this.name = name;
        this.url = url;
        this.webApp = webApp;
        this.creation = creation;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public LocalDateTime getCreation() {
        return creation;
    }
    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }
    public void setWebApp(boolean webApp) {
        this.webApp = webApp;
    }
    public boolean getWebApp(){
        return webApp;
    }
    @Override
    public String toString(){
        return "Name:" + getName() + ", URL:" + getUrl() + ", Creation Date:" + getCreation() + " WebApp:" + getWebApp();
    }
    
}

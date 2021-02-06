import java.time.LocalDateTime;

import models.Credential;
import models.Password;
import models.Resource;
import models.User;
import models.Words;

import java.util.ArrayList;


public class main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        System.out.println("Words Test \n");
        testWords();

        System.out.println("User Test \n");
        testUser();

        System.out.println("Resource Test \n");
        testResource();


    }

    public static void testWords(){
        Words dictionary = new Words(null, null, null, null, null);
        System.out.println("Random Number: " + dictionary.getRandomNumber());
        System.out.println("Random Letter: " + dictionary.getRandomLetter());

    }

    public static void testUser(){
        Password testPass = new Password("abc123");
        Credential testCreds = new Credential("Jimbo", testPass);
        ArrayList<Credential> creds = new ArrayList<>();
        creds.add(testCreds);
        User testUser = new User("Jim", "Kane", 21, "State College", "PA", "19020", creds);
        System.out.println("Password Value: " + testUser.getStoredCrednetials().get(0).getPassword().getValue());
        System.out.println("Username Value: " + testUser.getStoredCrednetials().get(0).getUserName());
        System.out.println("Zip Code: " + testUser.getZipCode());

    }

    public static void testResource(){
        Resource testRes = new Resource("vsCode", "www.bing.com", true, LocalDateTime.now());
        System.out.println("Name: " + testRes.getName());
        System.out.println("URL: " + testRes.getUrl());
        System.out.println("WebApp?: " + testRes.getWebAppp());
        System.out.println("Creation Date: " + testRes.getCreation());

    }
}
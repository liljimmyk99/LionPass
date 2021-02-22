package models;

import static java.lang.System.out;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import jdk.jfr.Timestamp;

public class TestHarness {

    public TestHarness(){
        testClassHierarchy();
    }

    public void testClassHierarchy(){
        System.out.println("testClassHierarchy function activated");
        ArrayList<User> superUser = new ArrayList<>();
        User enterpriseUser = new EnterpriseUser("Joe", "Shoe", 46, new Address("1234 Boring Ave", "Blueville", "AK", "12345", "USA"), null, new Credential("boring", new Password("person")), "987654321", "The Boring Company", "4796665762", new Address("5678 Who Do we", "Appricate", "FL", "56901", "USA"));
        User residentUser = new ResidentialUser("Jill", "Mill", 29, new Address("1234 Ideclare", "Thumbwar", "NJ", "78901", "USA"), null, new Credential("fun", new Password("league")), LocalDateTime.now(), 2, false, "9111199191", "123454321");
        superUser.add(enterpriseUser);
        superUser.add(residentUser);

        for(User user: superUser){
            user.billUser();
            System.out.println(user.toString());
            System.out.println("----------------------------------");
        }
        System.out.println("Conclusion of Test ClassHierarchy");
    }

    public void testWords(){
        out.println("Testing Words Object");
        Resource resource = new Resource("Canvas", "canvas.psu.edu", true, java.time.LocalDateTime.now());
        if (resource != null){
            out.println("Resource Object was created");
            out.println(resource);
        }

        //Test Set Methods
        resource.setName("Microsoft Office");
        resource.setUrl("office.com");
        resource.setWebApp(false);
        resource.setCreation(java.time.LocalDateTime.now());

        //Test Get Methods
        out.println(resource);

        out.println("Concluded Testing of Words Object");
        out.println("-----------------------------------------");
    }

    public void testResource(){
        out.println("Testing Resource Object");

        Words dictionary = new Words();
        out.println("Random Letter: " + dictionary.getRandomLetter());
        out.println("Random Number: " + dictionary.getRandomNumber());
        out.println("Random US State: " + dictionary.getRandomUsState());
        out.println("Random Thing: " + dictionary.getRandomThing());
        out.println("Random Verb: " + dictionary.getRandomVerb());
        out.println("Random Place: " + dictionary.getRandomPlace());
        out.println("Random Animal: " + dictionary.getRandomAnimal());
        out.println("Random Name: " + dictionary.getRandomPersonName());

        out.println("-----------------------------------------");
        out.println("Another Random Letter: " + dictionary.getRandomLetter());
        out.println("Another Random Number: " + dictionary.getRandomNumber());
        out.println("Another Random US State: " + dictionary.getRandomUsState());
        out.println("Another Random Thing: " + dictionary.getRandomThing());
        out.println("Another Random Verb: " + dictionary.getRandomVerb());
        out.println("Another Random Place: " + dictionary.getRandomPlace());
        out.println("Another Random Animal: " + dictionary.getRandomAnimal());
        out.println("Another Random Name: " + dictionary.getRandomPersonName());

        out.println("Concluded Testing of Resource Object");
        out.println("-----------------------------------------");
    }

    
}

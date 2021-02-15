package models;

import static java.lang.System.out;
import java.time.LocalDateTime;

public class TestHarness {

    public TestHarness(){
        testWords();
        testResource();
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

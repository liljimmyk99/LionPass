
// package models;

// import java.time.LocalDateTime;
// import java.util.ArrayList;

// import org.junit.Test;

// import static org.junit.Assert.assertEquals;

// import jdk.jfr.Timestamp;

// public class junit{

//     //
//     //  Resource Class
//     //
//     @Test
//     public void testGetName(){
//         System.out.println("Testing Get Name");
//         Resource test = new Resource("psu", "psu.edu", true, LocalDateTime.now());
//         assertEquals("psu", test.getName());
//     }
//     @Test
//     public void testGetUrl(){
//         System.out.println("Testing Get Url");
//         Resource test = new Resource("psu", "psu.edu", true, LocalDateTime.now());
//         assertEquals("psu.edu", test.getUrl());
//     }

//     @Test
//     public void testGetWebApp(){
//         System.out.println("Testing Get WebApp");
//         Resource test = new Resource("psu", "psu.edu", true, LocalDateTime.now());
//         assertEquals(true, test.getWebApp());
//     }

//     @Test
//     public void testGetCreation(){
//         System.out.println("Testing Get Creation");
//         LocalDateTime now = LocalDateTime.now();
//         Resource test = new Resource("psu", "psu.edu", true, now);
//         assertEquals(now, test.getCreation());
//     }

//     @Test
//     public void testResourceToString(){
//         System.out.println("Testing To String");
//         LocalDateTime now = LocalDateTime.now();
//         Resource test = new Resource("psu", "psu.edu", true, now);
//         String testoutput = "Name:" + test.getName() + ", URL:" + test.getUrl() + ", Creation Date:" + test.getCreation() + " WebApp:" + test.getWebApp();
//         assertEquals(testoutput, test.toString());
//     }


//     //
//     //  User Class
//     //

//     @Test
//     public void testGetFirstName(){
//         System.out.println("Testing getFirstName");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals("Jimmy", test.getFirstName());
//     }

//     @Test
//     public void testGetLastName(){
//         System.out.println("Testing getLastName");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals("Kane", test.getLastName());
//     }

//     @Test
//     public void testGetFullName(){
//         System.out.println("Testing getFullName");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals("Jimmy Kane", test.getFullName());
//     }

//     @Test
//     public void testGetAge(){
//         System.out.println("Testing getAge");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals(21, test.getAge());
//     }

//     @Test
//     public void testGetCityLocation(){
//         System.out.println("Testing getCityLocation");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals("Bensalem", test.getCityLocation());

//     }

//     @Test
//     public void testGetStateLocation(){
//         System.out.println("Testing getStateLocation");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals("PA", test.getStateLocation());
//     }

//     @Test
//     public void testGetZipCode(){
//         System.out.println("Testing getZipCode");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals("19020", test.getZipCode());
//     }

//     @Test
//     public void testGetStoredCredentials(){
//         System.out.println("Testing getGetStoredCredentials");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals(creds, test.getStoredCrednetials());
//     }

//     @Test
//     public void testCheckLogin(){
//         System.out.println("Testing checkLogin");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         assertEquals(true, test.checkLogin("I am password", "WE ARE PASS WORD"));
//     }

//     @Test
//     public void testUserToString(){
//         System.out.println("Testing toString");
//         ArrayList<Credential> creds = new ArrayList<>();
//         Credential testCred = new Credential("I am password", new Password("WE ARE PASS WORD"));
//         creds.add(testCred);
//         User test = new User("Jimmy", "Kane", 21, "Bensalem", "PA", "19020", creds, testCred);
//         String testOutput = "Name:" + test.getFullName() + ", Age:" + test.getAge() + ", City:" + test.getCityLocation() + 
//         ", State:" + test.getStateLocation() + ", Zip:" +test.getZipCode();;
//         assertEquals(testOutput, test.toString());
//     }
// }
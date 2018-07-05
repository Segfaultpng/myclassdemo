import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    Student person;

    @Before
    public void setup(){
        person = new Student("Stephen","Pettus","cs9stephen@gmail.com","123");
    }

    @Test
    public void testGetFirstName(){

        String expected = "Stephen";
        String actual = person.getFirstName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void  testGetLastName(){

        String expected = "Pettus";
        String actual = person.getLastName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testGetEmail(){

        String expected = "cs9stephen@gmail.com";
        String actual = person.getEmail();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetFirstName(){
        //Person name is Stephen

        person.setFirstname("Jamil");

        //expected should be Jamil
        String expected = "Jamil";

        String actual = person.getFirstName();

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void testSetLastName(){
        //Person name is Pettus

        person.setLastname("Branahm");

        //expected should be Branham
        String expected = "Branham";

        String actual = person.getLastName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSetEmail(){
        //Person name is Stephen

        person.setEmail("person@slikrick.com");

        //expected should be Jamil
        String expected = "person@slikrick.com";

        String actual = person.getEmail();

        Assert.assertEquals(expected,actual);

    }
}

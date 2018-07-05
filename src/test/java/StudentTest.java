import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    Student student;

    @Before
    public void setup(){
        student = new Student("Stephen","Pettus","cs9stephen@gmail.com","123");
    }

    @Test
    public void testGetFirstName(){

        String expected = "Stephen";
        String actual = student.getFirstName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void  testGetLastName(){

        String expected = "Pettus";
        String actual = student.getLastName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testGetEmail(){

        String expected = "cs9stephen@gmail.com";
        String actual = student.getEmail();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetFirstName(){
        //Student name is Stephen

        student.setFirstname("Jamil");

        //expected should be Jamil
        String expected = "Jamil";

        String actual = student.getFirstName();

        Assert.assertEquals(expected,actual);


    }
}

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
public void testGetFIrstName(){

    String expected = "Stephen";
    String acutal = student.getFirstName();

    Assert.assertEquals(expected,acutal);

}

}

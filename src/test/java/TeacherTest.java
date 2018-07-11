import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeacherTest {

    Teacher teacher;
    @Before
    public void setup(){

        teacher = new Teacher("Stephen","Pettus", "cs9Stephen@gmail.com","123");
    }

    @Test
    public void testTeach(){

        Student student = new Student("Jamil","Braniham","test@test.com","imafraidofcommitment");

        teacher.teach(student,5);


        double expected = 0.5;

        double actual = student.getCredits();

        Assert.assertEquals(expected,actual,.0000000001f);

    }
}

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

    @Test
    public void testTeachMultipleStudents(){

        Student student = new Student("Jamil","Braniham","test@test.com","imafraidofcommitment");
        Student student1 = new Student("Jamil","Braniham","test@test.com","imafraidofcommitment");

        Student[] students = {student,student1};

        teacher.teachMultipleStudents(students,5);
        double expected = 1.0;

        double actual = 0;

        actual += student.getCredits() + student1.getCredits();

        Assert.assertEquals(expected,actual,.0000000001f);

    }
}

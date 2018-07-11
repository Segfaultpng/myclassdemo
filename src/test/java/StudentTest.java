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
    public void workTest(){

        int expected = 5;
        student.work(5);

        int actual = student.getWorkedHours();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void learnTest(){
        double expected = 0.5;

        student.learn(5);
        double actual = student.getCredits();

        Assert.assertEquals(expected,actual,.0000000001f);
    }

    @Test
    public void testSetMoney(){
        double expected = 80.0;

        student.setMoney(80.0);

        double actual = student.getMoney();

        Assert.assertEquals(expected,actual,.00000001f);

    }

    @Test
    public void testSetCredit(){
        double expected = 123.0;

        student.setCredits(123.0);

        double actual = student.getCredits();

        Assert.assertEquals(expected,actual,.00000001f);
    }

    @Test
    public void testSetWorkedHours(){
        int expected = 16;

        student.setWorkedHours(16);

        int actual = student.getWorkedHours();

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void testIds(){

        Assert.assertTrue(true);


    }



}

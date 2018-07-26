import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegerArrayUtilsTest {

    IntegerArrayUtils integerArrayUtils;

    @Before
    public void setup(){

        Integer[] testing = {0,1,2,3,4};
        integerArrayUtils = new IntegerArrayUtils(testing);
    }

    @Test
    public void testToFind(){
        //String[] test = {"Jamil","Does","Not","Like","Commitment"};

        int expected = 1;

        int actual = integerArrayUtils.findInt(1);

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(null,integerArrayUtils.findInt(8));

    }

    @Test
    public void testPrint(){
        Integer[] test = {0,1,2,3,4};

        String expected = "0\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n";

        String actual = integerArrayUtils.printInt();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testAddAll(){


        int expected = 10;

        int actual = integerArrayUtils.addAll();

        Assert.assertEquals(expected,actual);

    }
}

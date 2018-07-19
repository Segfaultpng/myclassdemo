import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringArrayUtilsTest {

    StringArrayUtils stringArrayUtils;


    @Before
    public void setup(){

        String[] testing = {"Jamil","Does","Not","Like","Commitment"};
        stringArrayUtils = new StringArrayUtils(testing);
    }

    @Test
    public void testToFind(){
        String[] test = {"Jamil","Does","Not","Like","Commitment"};

        String expected = "Commitment";

        String actual = stringArrayUtils.findString(test[4]);

        Assert.assertEquals(expected,actual);

        expected = null;
        actual = stringArrayUtils.findString("Shouldntbehere");

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void printTest(){
        String[] test = {"Jamil","Does","Not","Like","Commitment"};

        String expected = "Jamil\n" +
                "Does\n" +
                "Not\n" +
                "Like\n" +
                "Commitment\n";

        String actual = stringArrayUtils.printStrings();

        Assert.assertEquals(expected,actual);



    }
}

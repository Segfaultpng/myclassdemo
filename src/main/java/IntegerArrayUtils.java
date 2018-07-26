public class IntegerArrayUtils {
    private Integer[] coolInts;
    private int someint;
    private Integer someinteer;

    public IntegerArrayUtils(Integer[] theints){

        this.coolInts = theints;
    }

    /*
     * This method should loop through the coolInts array with a for loop find the int passed
     * in as a parameter with an if statement
     *
     * if you find the int return it
     * if you don't return -1
     * **/
    public Integer findInt(Integer tofind){

        for (int i = 0; i < coolInts.length; i++) {
            if (tofind == (coolInts[i])){

                return coolInts[i];
            }

        }


        return null;
    }


    /*
     * This method should print all the int found in coolInts
     * e.g
     * if the array looks like this [0,1,2,3,4]
     *
     * then you should sout
     * 0
     * 1
     * 2
     * 3
     * 4
     *
     * use the new line character and a forloop to accomplish this \n
     *
     * hint to get the each string you can use coolInts[some variable tied to the loop]
     * **/
    public String printInt(){

        String result = "";

        for (int i = 0; i < coolInts.length; i ++) {
            result += coolInts[i].toString() + "\n";
            System.out.println(coolInts[i]);
        }

        return result;
    }


    /*
    * This method should add all ints in the coolInt array and return its sum
    * **/
    public Integer addAll(){
        Integer result = 0;

        for (int i = 0; i < coolInts.length; i ++) {
            result += coolInts[i];
            System.out.println(coolInts[i]);
        }


        return result;
    }


}

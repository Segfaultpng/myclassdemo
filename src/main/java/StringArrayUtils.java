public class StringArrayUtils {

    private String[] coolstrings;

    public StringArrayUtils(String[] strings){

        this.coolstrings = strings;
    }

    /*
    * This method should loop through the coolstrings array with a for loop find the string passed
    * in as a parameter with an if statement
    *
    * if you find the string return it
    * if you don't return null
    * **/
    public String findString(String tofind){

        for (int i = 0; i < coolstrings.length; i++) {
            if (tofind.equals(coolstrings[i])){

                return coolstrings[i];
            }
        }
        return null;
    }


    /*
    * This method should print all the strings found in coolstrings
    * e.g
    * if the array looks like this ["jamil","does","not","like","commitment"]
    *
    * then you should sout
    * jamil
    * does
    * not
    * like
    * commitment
    *
    * use the new line character and a forloop to accomplish this
    *
    * hint to get the each string you can use coolstrings[some variable tied to the loop]
    * **/
    public String printStrings() {

        String result = "";
        for (int i = 0; i < coolstrings.length; i ++) {
            result += coolstrings[i] + "\n";
            System.out.println(coolstrings[i]);

        }
        return result ;
    }
}

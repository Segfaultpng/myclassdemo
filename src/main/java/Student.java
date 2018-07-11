import java.util.*;

public class Student extends Person {

    private int workedHours;
    private double money;
    private double credits;




    private final double wage = 10.00; //an hr

    public Student(String newFirstName, String newLastName, String newEmail, String newPassword) {

        super(newFirstName, newLastName, newEmail, newPassword);

        this.workedHours = 0;
        this.money = 0.00;
        this.credits = 0;
    }



    /*
     * Getter method for the private variable workedHours
     * return workedHours
     * **/
    public int getWorkedHours() {

        return this.workedHours;



    }

    /*
     * Setter method for worked hours
     * set worked hours to be workedHours passed in
     * **/
    public void setWorkedHours(int workedHours) {

        this.workedHours = workedHours;

    }

    /*
     * Getter method for private variable money
     * return money
     * **/
    public double getMoney() {
        return this.money;
    }
    /*
     * Setter for money
     * **/
    public void setMoney(double money) {

        this.money = money;

    }

    /*
     * Getter method for private variable credits
     * return credits
     * **/
    public double getCredits() {
        return credits;
    }

    /*
     * Setter method for private variable credits
     * set credits
     * **/
    public void setCredits(double credits) {
        this.credits = credits;

    }

    /*
    * The work method should take the param workedHours. Multiply it by the double wage and add the result to the current amount of money
    * add amount of worked hours passed to this.workedHours
    * @param workedHours amount of hours a student can work
    * **/
    public void work(int workedHours){
        this.money += workedHours * wage;
        this.workedHours += workedHours;



    }
    /*
    * The learn method will be used to keep track of how many credits a student has. After they reach 123credits a student should graduate.
    * every 10 hrs is 1 credit.
    * classhours should be divided by 10 result should be added to credits
    *
    * **/
    public void learn(int classHours){
        this.credits += classHours/10;

    }




    public static void main(String args[]){

        Teacher teacher = new Teacher("Stephen","Pettus","cs9stephen@gmail.com","123");
        Student student = new Student("jamil","i","jamil@i.com","123");


    }

}

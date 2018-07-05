public class Student extends Person {

    private int workedHours;
    private double money;

    private final double wage = 10.00;

    public Student(String newFirstName, String newLastName, String newEmail, String newPassword) {

        super(newFirstName, newLastName, newEmail, newPassword);

        this.workedHours = 0;
        this.money = 0.00;
    }

    public void work(int workedHours){

        this.money += (workedHours * wage);

    }

    public void learn(int classHours){

    }

}

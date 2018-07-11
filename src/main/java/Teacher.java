public class Teacher extends Person {
    public Teacher(String newFirstName, String newLastName, String newEmail, String newPassword) {
        super(newFirstName, newLastName, newEmail, newPassword);
    }



    /*
    * This method will allow a teacher tp teach a student
    * how can this be done?
    * **/
    public void teach(Student student,int hoursTaught){

        student.learn(hoursTaught);
    }
}

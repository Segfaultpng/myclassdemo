public class Teacher extends Person {
    public Teacher(String newFirstName, String newLastName, String newEmail, String newPassword) {
        super(newFirstName, newLastName, newEmail, newPassword);
    }



    /*
     * This method will allow a teacher to teach a student
     * how can this be done?
     * **/
    public void teach(Student student,int hoursTaught){

        student.learn(hoursTaught);
    }

    /*
    This method will allow a teacher to teach multiple students
    * how can this be done?
    * hint you need a forloop
    * **/
    public void teachMultipleStudents(Student[] students, int hoursTaught){

        for (int i = 0; i < students.length; i++){
            //teach each student like before hint: to access a student use students[i]

        }


    }
}

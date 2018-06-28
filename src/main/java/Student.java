/*
* A student must have these following instance variables
* firstname: String
* lastname: String
* studentID: Int
* email: String
* password: String
*
* What can a student do?
*
* get and set all variables
* e.g
*
* public void setFirstName(String newfirstname){
* this.firstname = newfirstname;
*
* }
*
* public String getFirstName(){
* return this.firstname;
* }
* */


public class Student {

    private String firstname;
    private String lastname;
    private static int studentID;
    private  String email;
    private String password;

    public Student(String newFirstName,String newLastName,String newEmail,String newPassword ){

        this.firstname = newFirstName;
        this.lastname = newLastName;
        this.studentID +=1;
        this.email = newEmail;
        this.password = newPassword;



    }

    public String getFirstName(){
        return firstname;
    }

    public void setFirstname(String newfirstname ){
        this.firstname = newfirstname;
    }

    public String getLastName(){
        return lastname;
    }

    public void setLastname(String newlastname ){
        this.lastname = newlastname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail ){
        this.email = newEmail;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String newPassword ){
        this.password = newPassword;
    }
}

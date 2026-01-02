package student_management_system;

public class Main {
    public static void main(String[]arg) {

        // Create two Student objects
        Student st1=new Student("Vironica",01111,"Software testing",3.6);
        Student st2=new Student("Aya",01112,"Software testing",3.1);

        // Display student information
        st1.displayStudentInfo() ;
        st2.displayStudentInfo();

        // Update GPA for one student
        st1.Gpa(2.8);
    }}
package student_management_system;

public class Student {

    //Attributes
    private String name;
    private int StudentID;
    private String major;
    private double gpa;


    // Parameterized constructor
    public Student(String name, int studentID, String major, double gpa) {
        this.name = name;
        this.StudentID = studentID;
        this.major = major;
        this.gpa = gpa;
    }

    // Display student information
    public void displayStudentInfo(){
        System.out.println("name: "+name);
        System.out.println("Student ID: "+StudentID );
        System.out.println("GPA: "+gpa);
        System.out.println("Major: "+major);
        System.out.println("------------------------");
    }

    //Update GPA with before/after output
    public void  Gpa(double newGPA){
        System.out.println("current GPA: "+gpa);
        this.gpa=newGPA;
        System.out.println("Updated GPA: " + gpa);
    }

}

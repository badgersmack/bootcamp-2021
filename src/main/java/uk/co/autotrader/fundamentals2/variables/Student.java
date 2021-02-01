package uk.co.autotrader.fundamentals2.variables;

public class Student {
    public String StudentName; //instacne veriable

    public static final String SUBJECT= "FRENCH"; //static means constant

    public Student(String name) {
        this.StudentName = name;
    }

    public void printDetails(){
        System.out.println("StudentName = " + StudentName);
    }

    public static void main(String[] args) {
        Student student = new Student("John");
        student.printDetails();
    }
}

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "S12345");
        student1.setCredits(15);
        student1.setTotal(45);
        
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getID());
        System.out.println("Credits: " + student1.getCredits());
        System.out.println("Total Points: " + student1.getTotal());
        System.out.println("GPA: " + student1.gpa());
    }
}
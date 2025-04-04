import java.util.ArrayList;

public class Course{
    private String name;
    private String code;
    private int max;
    private Instructor instructor;
    private ArrayList<Student> students = new ArrayList<>();

    // Task 1: Complete
    public Course(String name, String code, int max){
        this.name = name;
        this.code = code;
        this.max = max;
    }

    // Task 2: Complete
    public Instructor getInstructor(){
        return instructor;
    }
    public void setInttructor(Instructor instructor){
        this.instructor= instructor;
    }
}
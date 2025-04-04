public class Course{
    private String name;
    private String code;
    private static final int MAX_STUDENT =35;
    private Instructor instructor;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name, String code, Instructor instructors){
        this.name = name;
        this.code = code;
        this.Instructor= instructors;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public Instructor getInstructor(){
        return instructor;
    }
    public void setInttructor(Instructor instructor){
        this.instructor= instructor;
    }
    public int getNumberofStudent(){
        return students.size();
    }
    public boolean addStudent(Student student){
        if (students.size() < MAX_STUDENT){
            student.add(student);
            return true;
        }else{
            System.out.println("Cannot add student. Course is full.");
            return false;
        }
    }
}
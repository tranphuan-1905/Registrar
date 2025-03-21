public class Instructor {
    private final String name;
    private final String id;
    private String department; 

    public Instructor (String name, String id){
        this.name= name;
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }

}

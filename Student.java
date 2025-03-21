public class Student {
    private final String name;
    private final String id;
    private double credits;
    private double total;
    
    public Student (String name, String id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Student)){
            return false;
        }
        if (((Student) obj).getID() == null || this.getID() == null){
            return false;
        }
        return ((Student) obj).getID().equals(this.getID());  
    }


    @Override
    public int hashCode() {
        return 1;
    } 

    public double getCredits() {
        return credits;
    }

    public double getTotal() {
        return total;
    }

    public void setCredits(double credits){
        this.credits=credits;
    }
    public void setTotal(double total){
        this.total=total;
    }
    public double gpa(){
        return getTotal()/getCredits();
    }
    
}


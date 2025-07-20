package department;

public abstract class Department {
    private String deptName;
    private String location;   //private fields
    private int deptHead;

    public Department(String deptName, String location, int deptHead){
        this.deptName = deptName;
        this.location = location;
        this.deptHead = deptHead;
    }

    //Getters
    public String getDeptName(){
        return deptName;
    }
    public String getLocation(){
        return location;
    }
    public int getDeptHead(){
        return deptHead;
    }

    //Setters
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setDeptHead(int deptHead){
        this.deptHead = deptHead;
    }

    @Override
    public String toString(){ //display department details
        return "Department name: "+deptName + "\nDepartment location: " + location + "\nDepartment Head: " + deptHead;
    }
}

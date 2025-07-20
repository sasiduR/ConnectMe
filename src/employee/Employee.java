package employee;

public abstract class Employee {
    private String empName;
    private int empID; //setup private Fields
    private String department;
    private String designation;

    public Employee(String empName, int EmpID, String Department,String Designation){ //constructor
        this.empName= empName;
        this.empID= EmpID;
        this.department= Department;
        this.designation= Designation;
    }

    //getters
    public String getEmpName(){
        return empName;
    }
    public int getEmpID(){
        return empID;
    }
    public String getDepartment(){
        return department;
    }
    public String getDesignation(){
        return designation;
    }

    //setters
    public void setName(String empName){
        this.empName=empName;
    }
    public void setEmpID(int empID){
        this.empID=empID;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }

    @Override
    public String toString(){  //display employee details
        return "Name: "+ empName +"\nEmployee ID: "+ empID +"\nDepartment: "+department
                +"\nDesignation: "+designation;
    }
}

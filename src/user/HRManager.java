package user;
import department.Department;
import employee.Employee;
import java.util.ArrayList;
import java.util.HashMap;

public class HRManager {

    private String name; //private fields
    private ArrayList<Department> departments;
    private HashMap <Department,ArrayList<Employee>> employees;
    private ArrayList<HRAssistant>assistants;

    public HRManager(String name){ //constructor
        this.name = name;
        this.departments = new ArrayList<>();
        this.employees = new HashMap<>();
        this.assistants = new ArrayList<>();
    }

    public void addDepartment(Department newDept){ //add department
        departments.add(newDept);
        employees.put(newDept,new ArrayList<>());
    }

    public void removeDepartment(Department dept){ //remove department
        departments.remove(dept);
    }

    public void addEmployee(Employee newEmp , Department dept){ //add employee
        if(departments.contains(dept)){
            employees.get(dept).add(newEmp);
        }else{
            System.out.println("Department doesn't exist");
        }
    }

    public void promoteEmployee(Department dept, String designation, Employee selectEmp){ //promote existing employee
        ArrayList<Employee> empList=employees.get(dept);
        for(Employee emp :empList){
            if(emp.getEmpID() == selectEmp.getEmpID()){
                emp.setDesignation(designation);
                break;
            }
        }

    }

    public void removeEmployee(Employee emp){ //remove employee
        for (ArrayList<Employee> empList: employees.values()){
            if(empList.contains(emp)){
                empList.remove(emp);
                break;
            }
        }
    }

    public void addAssistant(HRAssistant newAssistant){ //add new assistant
        assistants.add(newAssistant);
    }


}

import java.util.Scanner;

import employee.Employee;
import user.HRManager;
import department.Department;
import util.FileReadWriter;

public class Main{
    public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
         while(true){
             System.out.println(".........Employee management system.........");
             System.out.println("enter your choice");
             System.out.println("1. Add Department");
             System.out.println("2. Remove Department");
             System.out.println("3. Add Employee");
             System.out.println("4. Remove Employee");
             System.out.println("5. Promote Employee");
             System.out.println("6. Add HR Assistant");
             System.out.println("7. save to a file");
             System.out.println("exit");

             int choice = sc.nextInt();
             sc.nextLine();
             HRManager hr= new HRManager();
             switch(choice){
                 case 1:
                     System.out.println("Enter Department name");
                     String deptName = sc.nextLine();
                     Department newDept= new Department(deptName,"second floor",2020100520);
                     hr.addDepartment(newDept);
                     break;

                 case 2:
                     System.out.println("Enter the Department name you want to remove");
                     Department DeptName=new Department(sc.nextLine(),"second floor",2020100520);
                     hr.removeDepartment(DeptName);
                     break;

                     case 3:
                         System.out.println("Enter the employee name: ");
                         String empName = sc.nextLine();
                         System.out.println("Enter the Department name: ");
                         String dept = sc.nextLine();
                         Employee employee=new Employee(empName,2020021521,dept,"clerk");
                         hr.addEmployee(employee,dept);
                         break;
                     case 4:
                         System.out.println("Enter the employee name: ");
                         String name=sc.nextLine();
                         System.out.println("Enter the Department name: ");
                         String dName=sc.nextLine();
                         Employee emp1=hr.findEmployee(name,dName);
                         if(name !=null){
                             hr.removeEmployee(emp1);
                         }
                         break;
                     case 5:
                         System.out.println("Enter the employee name: ");
                         String emp = sc.nextLine();
                         System.out.println("Enter the Department name: ");
                         String department = sc.nextLine();
                         System.out.println("Enter new designation: ");
                         String designation = sc.nextLine();
                         emp1=hr.findEmployee(emp,department);
                         if(emp1!=null){
                             hr.promoteEmployee(department,designation,emp1);
                         }
                         break;

                         case 6:
                             System.out.println("Enter Assistant name: ");
                             String assistant = sc.nextLine();
                             hr.addAssistant(assistant);
                             break;

                         case 7:
                             String data= hr.WriterHelper();
                             FileReadWriter fw= new FileReadWriter();
                             fw.WriteFile(data);
             }


         }
    }


}
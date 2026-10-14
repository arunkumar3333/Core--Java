package Opps;
class Employee{
    public void employee(String empName, int emp_id, double salary){
        System.out.println("The Employee "+empName+" having id "+emp_id+" is earning salary of "+salary+" per month!");
    }
}
class Department{
    public void department(String dept_id, String dept_name){
        System.out.println("The Department name is "+dept_name+" having Department ID is: "+dept_id);

    }
}
public class Company {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Department dept=new Department();
        System.out.println();
        emp.employee("Arun Kumar V",101,35000.0);
        System.out.println();
        dept.department("JFSD00005"," Java Full Stack Developeres");
    }
}

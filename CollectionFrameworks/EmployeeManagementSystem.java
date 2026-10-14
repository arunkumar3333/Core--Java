package CollectionFrameworks;
import java.util.*;
class Employee{
    int id;
    String name;
    String department;
    double salary;
    Employee(String name, int id, String dept, double sal){
        this.name=name;
        this.id=id;
        this.department=dept;
        this.salary=sal;
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // 1.Store employee details in an ArrayList.
    ArrayList<Employee> employees=new ArrayList<>();
    employees.add(new Employee("Arun",101,"IT",35000.0));
    employees.add(new Employee("Raj",102,"Manager",25000.0));
    employees.add(new Employee("Akash",103,"HR",15000.0));
    employees.add(new Employee("Jak",101,"IT",35000.0));
    employees.add(new Employee("Deepika",104,"Data Analyst",25000.0));
    employees.add(new Employee("Kumar",105,"JAVA",125000.0));
    System.out.println("Employee Details are......");
    for(Employee e:employees){
        System.out.println("Name: "+e.name);
        System.out.println("ID: "+e.id);
        System.out.println("Department: "+e.department);
        System.out.println("Salary: "+e.salary);
        System.out.println("----------------------------------");
    }

    // 2.Display all employees belonging to the "IT" department.
        System.out.println("IT department employees are...");
    for(Employee em:employees){
    if(em.department.equals("IT")){
        System.out.println("Name: "+em.name);
        System.out.println("ID: "+em.id);
        System.out.println("Department: "+em.department);
        System.out.println("Salary: "+em.salary);
        System.out.println("........................");
    }
    }
            // 4 Sort employees by salary in descending order using loops.
        System.out.println("Employees Salary in descending order");
        for (int i=0;i<employees.size();i++){
            for(int j=i+1;j<employees.size();j++){
                if(employees.get(i).salary<employees.get(j).salary){
                    Employee temp=employees.get(i);
                    employees.set(i,employees.get(j));
                    employees.set(j,temp);
                }
            }
        }
        for(Employee dup:employees){
            System.out.println("Name: "+dup.name);
            System.out.println("ID: "+dup.id);
            System.out.println("Department: "+dup.department);
            System.out.println("Salary: "+dup.salary);
            System.out.println("........................");
        }
        // 3, 7  Employees First and second, Highest salary logic
        double highestSal=0;
        double secondSal=0;
        Employee high=null;
        Employee secondHigh=null;
        for(Employee h:employees){
            if(h.salary>highestSal){
                secondSal=highestSal;
                secondHigh=high;
                highestSal=h.salary;
                high=h;
            }else if(h.salary<highestSal && h.salary>secondSal){
                secondSal=h.salary;
                secondHigh=h;
            }
        }
        // 3.Find the employee with the highest salary using loops
        System.out.println("Employee with highest salary.");
        if(high!=null) {
            System.out.println("Name: " + high.name);
            System.out.println("ID: " + high.id);
            System.out.println("Department: " + high.department);
            System.out.println("Salary: " + high.salary);
            System.out.println("........................");
        }
        // 7 Find the second-highest distinct salary and display the employee or employees earning that salary.
        System.out.println("Employee with Second highest salary.");
        if(secondHigh!=null){
            System.out.println("Name: " + secondHigh.name);
            System.out.println("ID: " + secondHigh.id);
            System.out.println("Department: " + secondHigh.department);
            System.out.println("Salary: " + secondHigh.salary);
            System.out.println("........................");
        }else{
            System.out.println("No! Employee with Second highest salary.");
        }
        // 5.Remove duplicate employees based on Employee ID using a HashSet
      Set<Integer> emp_id=new HashSet<>();
        List<Employee> uniqueEmployees=new ArrayList<>();
        for(Employee emp:employees){
            if(emp_id.add(emp.id)){
                uniqueEmployees.add(emp);
            }
        }
        employees.clear();
        employees.addAll(uniqueEmployees);
        System.out.println("Employees details after removing duplicates..");
        for(Employee emp:uniqueEmployees){
            System.out.println("Name: " + emp.name);
            System.out.println("ID: " + emp.id);
            System.out.println("Department: " + emp.department);
            System.out.println("Salary: " + emp.salary);
            System.out.println("........................");
        }
    }
}

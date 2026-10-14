package Encapsulation;
class Employee{
    private String emp_name;
    private String emp_roll;
    private String emp_id;
    private double emp_sal;
    public void setEmp_name(String n){
        this.emp_name=n;
    }
    public void setEmp_roll(String r){
        this.emp_roll=r;
    }
    public void setEmp_id(String id){
        this.emp_id=id;
    }
    public void setEmp_sal(double s){
        this.emp_sal=s;
    }
    public String getEmp_name(){
        return emp_name;
    }
    public String getEmp_roll(){
        return emp_roll;
    }
    public String getEmp_id(){
        return emp_id;
    }
    public double getEmp_sal(){
        return emp_sal;
    }
}
public class Company {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmp_name("Arun");
        emp.setEmp_id("1VE24");
        emp.setEmp_roll("Full Stack Dev");
        emp.setEmp_sal(35000);
        System.out.println("Employee Info: "+"Name: "+ emp.getEmp_name()+"  Roll: "+ emp.getEmp_roll()+"ID: "+ emp.getEmp_id()+"  Salary: "+ emp.getEmp_sal());
    }
}

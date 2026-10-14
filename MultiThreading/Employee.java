package MultiThreading;
class emp extends Thread{
    String empName;
    float cgpa;
    emp(String n, float c){
        this.empName=n;
        this.cgpa=c;
    }
    public  void run(){
        System.out.println("Employee details are: Name:-"+empName+"  CGPA:-"+cgpa);
    }
}
class Application extends Thread{
    String role;
    float ctc;
    Application(String role, float ctc){
        this.role=role;
        this.ctc=ctc;
    }
    public void run(){
        System.out.println("Application info..Role:-"+role+"  CTC:-"+ctc+"LPA");
    }
}
class Company extends Thread{
    String companyName;
    String jobType;
    Company(String companyName,String jobType){
        this.companyName=companyName;
        this.jobType=jobType;
    }
    public void run(){
        System.out.println("Company Info:   Name:-"+companyName+"  Jon Type:- "+jobType);
    }
}
public class Employee {
    public static void main(String[] args) {
        emp emp=new emp("Arun",8.6f);
        Application application=new Application("JFSD",4.5f);
        Company company=new Company("TATA Strive","Full Time");
        emp.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        application.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        company.start();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

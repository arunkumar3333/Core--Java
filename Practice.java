import MultiThreading.Employee;

import java.util.*;
import java.util.stream.Collectors;

class Workers {
    String name;
    String dep;
    int id;
    double sal;
    Workers(String n, String dep, int id,double sal){
        this.name=n;
        this.dep=dep;
        this.id=id;
        this.sal=sal;
    }
}
public class Practice {
    public static void main(String[] args) {
        List<Workers> employees=new ArrayList<>();
        employees.add(new Workers("Arun Kumar V","IT",101,25000.0));
        employees.add(new Workers("Akash","HR",102,15000.0));
        employees.add(new Workers("Raj","Finance",103,45000.0));
        employees.add(new Workers("Anusha","Data Analyst",104,35000.0));
        System.out.println("Employee Details are..");
        for(Workers emp:employees){
            System.out.println("Name: "+emp.name+"\t ID: "+emp.id+"\t Department: "+emp.dep+"\t Salary: "+emp.sal);
        }
        System.out.println("------------------------------");
        System.out.println("IT department employees");
        for(Workers emp:employees){
            if(emp.dep.equalsIgnoreCase("it")){
                System.out.println("Name: "+emp.name+"\t ID: "+emp.id+"\t Department: "+emp.dep+"\t Salary: "+emp.sal);
            }
        }
        System.out.println("------------------------------");
        System.out.println("Employees with highest and second highest salary");
        double highest=0;
        double secondHighest=0;

        Workers emphighest=null;
        Workers empsecondHighest=null;
        for(Workers workers:employees){
            if(workers.sal>highest){
                highest=secondHighest;
                empsecondHighest=emphighest;

                highest=workers.sal;
                emphighest=workers;
            }
        }
        System.out.println("First Highest salary:");
        if(emphighest!=null){
            System.out.println("Name: "+emphighest.name+"\t ID: "+emphighest.id+"\t Department: "+emphighest.dep+"\t Salary: "+emphighest.sal);
        }
        System.out.println("------------------------------");
        System.out.println("Second Highest salary:");
        if(empsecondHighest!=null){
            System.out.println("Name: "+empsecondHighest.name+"\t ID: "+empsecondHighest.id+"\t Department: "+empsecondHighest.dep+"\t Salary: "+empsecondHighest.sal);
        }else {
            System.out.println("No second Highest salary employee");
        }
        System.out.println("------------------------------");

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);
        System.out.println(pq);
        //Collections.sort(pq, Collections.reverseOrder());

        double high=0;
        double secondHigh=0;
        Workers empHigh=null;
        Workers empSecond=null;
        for(Workers ep:employees){
            if(ep.sal>high){
                secondHigh=ep.sal;
                empSecond=empHigh;
                high= ep.sal;
                empHigh=ep;
            } else if (ep.sal<high && ep.sal>secondHigh) {
                secondHigh=ep.sal;
                empSecond=ep;
            }
        }
        if(empHigh!=null){
            System.out.println("Name: "+empHigh.name+"\t ID: "+empHigh.id+"\t Department: "+empHigh.dep+"\t Salary: "+empHigh.sal);
        }
        if(empSecond!=null){
            System.out.println("Name: "+empSecond.name+"\t ID: "+empSecond.id+"\t Department: "+empSecond.dep+"\t Salary: "+empSecond.sal);
        }
        System.out.println("\n");
        System.out.println("Employee sal ascending");
        for(int i=0;i<employees.size();i++){
            for(int j=i+1;j<employees.size();j++){
                if(employees.get(i).sal>employees.get(j).sal){
                    Workers temp=employees.get(i);
                    employees.set(i,employees.get(j));
                    employees.set(j,temp);
                }
            }

        }
        for(Workers w:employees){
            System.out.println("Name: "+w.name+"\t ID: "+w.id+"\t Department: "+w.dep+"\t Salary: "+w.sal);
            System.out.println("----------");
        }

        System.out.println("\n");
        System.out.println("Employee sal descending");
        for(int i=0;i<employees.size();i++){
            for(int j=i+1;j<employees.size();j++){
                if(employees.get(i).sal<employees.get(j).sal){
                    Workers temp=employees.get(i);
                    employees.set(i,employees.get(j));
                    employees.set(j,temp);
                }
            }

        }
        for(Workers w:employees){
            System.out.println("Name: "+w.name+"\t ID: "+w.id+"\t Department: "+w.dep+"\t Salary: "+w.sal);
            System.out.println("----------");
        }
        List<Workers> list=new ArrayList<>();
        list.add(new Workers("JAck","Iyt",101,35000.00));
        for(Workers workers:list){
            System.out.println(workers.name+" "+workers.dep+" "+workers.sal+" "+workers.id);
        }

    }
}

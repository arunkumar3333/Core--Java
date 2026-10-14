package ConditionalStatements;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=sc.nextInt();
        int num=1600%100;
        System.out.println(num);
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println(year+" is Leaf year");
        }else{
            System.out.println(year+" is not leaf year");
        }
    }
}

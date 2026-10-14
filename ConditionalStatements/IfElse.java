package ConditionalStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age of a person: ");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Eligible to get Driving Licence");
        }else{
            System.out.println("Not Eligible for Driving licence");
        }
    }
}

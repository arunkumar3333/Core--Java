package ConditionalStatements;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Percentage: ");
        float percentage=sc.nextInt();
        if(percentage>90){
            System.out.println("A+ Grade");
        }
        else if(percentage<=90 && percentage>=80){
            System.out.println("A Grade");
        } else if (percentage<=70 && percentage>=60) {
            System.out.println("B Grade");
        } else if (percentage<=60 && percentage>=50) {
            System.out.println("C Grade");
        }else{
            System.out.println("Need more focus on life!");
        }
    }
}

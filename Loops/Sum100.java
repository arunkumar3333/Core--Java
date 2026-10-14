package Loops;

import java.util.Scanner;

public class Sum100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how 1- how many Numbers to calculate sum: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of 1-"+num+" Numbers is "+sum);
    }
}

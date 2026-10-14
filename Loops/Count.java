package Loops;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long num=sc.nextLong();
        long num1=num;
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println("There are "+count+" digits in the Number:->"+num1);
    }
}

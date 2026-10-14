package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many fibonacci number: ");
        int series=sc.nextInt();
        int x=0,y=1;
        while(series!=0){
            System.out.print(x+"\t");
            int z=x+y;
            x=y;
            y=z;
            series--;
        }
    }
}

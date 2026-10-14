package Loops;

import java.util.Scanner;

public class Butterfly
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows to print Butterfly Pattern:");
        int num=sc.nextInt();
       for(int i=1;i<num;i++){
           for(int j=1;j<=num;j++){
               if(j<=i){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
           }
           for(int j=2;j<=num;j++){
               if(i+j>=num+1){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i+j<=num+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=2;j<=num;j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}

package Loops;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        boolean tr=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                tr=false;
                break;
            }
        }
        if(tr){
            System.out.println(num+" is a Prime Number!");
        }else {
            System.out.println(num+" is not a Prime Number!");
        }
    }
}

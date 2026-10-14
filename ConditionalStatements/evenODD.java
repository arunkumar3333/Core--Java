package ConditionalStatements;

import java.util.Scanner;

public class evenODD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        if(num>0){
            if(num%2!=0){
                System.out.println(num+" is Positive ODD number");
            }else{
                System.out.println(num+" is Positive Even Number");
            }
        }else {
            if(num%2!=0){
                System.out.println(num+" is Negative ODD Number");
            }else{
                System.out.println(num+" is Negative even number");
            }
        }
    }
}

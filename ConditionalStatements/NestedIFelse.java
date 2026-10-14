package ConditionalStatements;

import java.util.Scanner;

public class NestedIFelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+"(num1) is greater");
            }else{
                System.out.println(num3+"(num3) is greater");
            }
        }else {
            if(num2>num3){
                System.out.println( num2+"(num2) is greater");
            }else{
                System.out.println(num3+"(num3) is greater");
            }
        }
    }
}

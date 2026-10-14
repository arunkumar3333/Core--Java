package Introduction;

import java.util.Scanner;

public class SwaPTwoNoWithoutUsingThirdVar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Numbers before swaping\n"+"Num1: "+num1+"\t Num2: "+num2);
        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Numbers After swaping\n"+"Num1: "+num1+"\t Num2: "+num2);
    }
}

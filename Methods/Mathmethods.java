package Methods;

import java.util.Scanner;

public class Mathmethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two munbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Max of two numbers is "+Math.max(a,b));
        System.out.println("Min of two numbers : "+Math.min(a,b));
        System.out.println("Square of "+a+" is: "+Math.sqrt(a));
        System.out.println("Abs: "+Math.abs(a));
    }
}

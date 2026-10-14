package ConditionalStatements;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+"(a) is Greater");
        } else if (b>a && b>c) {
            System.out.println(b+" (b) is greater");
        }else {
            System.out.println(c+" (b) is greater");
        }
    }
}

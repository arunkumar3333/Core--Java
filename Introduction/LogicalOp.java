package Introduction;

import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values: ");
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        System.out.println("a && b is :"+(a&&b));
        System.out.println("a || b is :"+(a||b));
        System.out.println("a != b is :"+(a!=b));
    }
}

package Introduction;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String a=sc.nextLine();
        System.out.println("Enter RollNum: ");
        String roll=sc.nextLine();
        System.out.println("Enter Branch: ");
        String branch=sc.nextLine();
        System.out.println("Enter College name: ");
        String college=sc.nextLine();
        System.out.println("Enter Age: ");
        int b=sc.nextInt();
        System.out.println("Enter PhNum: ");
        long ph=sc.nextLong();

        System.out.println("Enter CGPA: ");
        float cgpa=sc.nextFloat();
        System.out.println("Mr/Ms:"+a+"'s roll number is "+roll+" from  the branch "+branch+" & college is "+college+" "+b+"years old with phone number is "+ph+" and CGPA is "+cgpa);

    }
}

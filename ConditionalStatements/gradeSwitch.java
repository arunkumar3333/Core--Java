package ConditionalStatements;

import java.util.Scanner;

public class gradeSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 Subjects Marks");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. ReactJs");
        int java=sc.nextInt();
        int python=sc.nextInt();
        int reactjs=sc.nextInt();
        int avg=(java+python+reactjs)/3;
        System.out.println("Average: "+avg);
        switch (avg/10){
            case 10:
                System.out.println("Grade: A+");
                break;
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B+");
                break;
            case 7:
                System.out.println("Grade: B ");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Do Hardwork and better luck next Time!");
        }
    }
}

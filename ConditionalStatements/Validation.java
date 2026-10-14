package ConditionalStatements;

import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Role:");
        String role=sc.nextLine();
        System.out.println("Enter the UserName:");
        String user=sc.nextLine();
        System.out.println("Enter the Password:");
        String pass=sc.nextLine();

        if(role.equals("Admin")){
            if(user.equals("Arun")){
                if(pass.equals("Arun123")){
                    System.out.println("You have an access to Manage the Website");
                }else{
                    System.out.println("Incorrect Password Admin Credentials");
                }
            }else{
                System.out.println("Incorrect User for admin");
            }
        } else if (role.equals("Developer")) {
            System.out.println("You are a Developer and have access to develop the code");
        }else{
            System.out.println("Not a developer");
        }

    }

}

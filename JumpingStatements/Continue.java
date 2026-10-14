package JumpingStatements;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hom many numbers: ");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            if(i==3){
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}

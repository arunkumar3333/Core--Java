package Loops;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while (num!=0){
            count++;
            num/=10;
        }
        num=temp;
        int sum=0;
        while(num>0){
            int digit=num%10;
            int pow=1;
            for(int i=1;i<=count;i++){
                pow*=digit;
            }
            sum+=pow;
            num/=10;
        }
        if(sum==temp){
            System.out.println(temp+" is Amstrong Number");
        }else{
            System.out.println(temp+" is not a Amstrong Number");
        }
    }
}

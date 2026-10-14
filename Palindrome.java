import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num != 0) {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println("The reverse of a Number"+num+" is :"+rev);
        System.out.println(temp);
        if(rev==temp){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
    }
}

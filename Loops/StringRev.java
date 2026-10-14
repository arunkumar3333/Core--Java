package Loops;

import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String rev=new String(arr);
        if(rev.equals(str)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

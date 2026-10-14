package Arrays;

import java.util.Scanner;

public class SmallestEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        for (int i=0;i<size;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("Smallest Element is: "+small);
    }
}

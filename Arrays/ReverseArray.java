package Arrays;

import java.util.Scanner;
import java.util.SortedMap;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int s= sc.nextInt();
        int [] array=new int[s];
        System.out.println("Enter the elements ");
        for(int i=0;i<s;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("The Original array elements are ");
        for(int i=0;i<s;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        System.out.println("The reversed array is ");
        int[] rev=new int[s];
        int last=array.length-1;
        int first=0;
        int temp;
        for(int i=1;i<s/2;i++){
            temp=array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i<s;i++){
            System.out.print(array[i]+"\t");
        }
    }
}

package Arrays;

import java.util.Arrays;

public class MissNo2 {
    public static void main(String[] args) {
        int[] arr={1,2,0,5,6,3};
        Arrays.sort(arr);
        System.out.println("Sorted Array is..");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i) {
                System.out.println("Missing Number is: "+i);
                break;
            }
        }
    }
}

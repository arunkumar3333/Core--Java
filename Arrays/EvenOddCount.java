package Arrays;
import java.util.Scanner;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i:arr){ //it directly loops through all values instead of index
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of Even numbers: "+even);
        System.out.println("Number of Odd numbers: "+odd);
    }
}

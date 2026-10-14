package Arrays;
import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate Elements are");
        for(int i=0;i<size;i++){
            boolean flagalready=false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    flagalready=true;
                    break;
                }
            }
            if(flagalready){
                continue;
            }
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+"  ");
                    break;
                }
            }
        }

    }
}
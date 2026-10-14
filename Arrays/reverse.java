package Arrays;
import java.util.Scanner;
public class reverse {
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
        System.out.println("The reversed array is...");
        //System.out.println();
        int[] rev=new int[s];
        int j=0;
        for(int i=array.length-1;i>=0;i--){
            System.out.print((rev[j]=array[i])+"\t");
          j++;
        }

    }
    }
package Arrays;
import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and columns: ");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] arr1=new int[r][c];
        int [][] arr2=new int[r][c];
        int [][] arr3=new int[r][c];
        System.out.println("Enter the elements for first matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the elements for Second matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Addition of Matrices");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for (int[] ints : arr3) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}

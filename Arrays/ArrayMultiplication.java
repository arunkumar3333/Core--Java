package Arrays;

import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int rows= sc.nextInt();
        int cols= sc.nextInt();
        int[][] arr1=new int[rows][cols];
        int[][] arr2=new int[rows][cols];
        int[][] arr3=new int[rows][cols];
        System.out.println("Enter "+rows+"X"+cols+"  elements for 1st Matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter "+rows+"X"+cols+"  elements for 2nd Matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Multiplication of Two Matrices");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print((arr3[i][j]=arr1[i][j]*arr2[i][j])+"\t");
            }
            System.out.println();
        }
    }
}

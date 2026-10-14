package Loops;
import java.util.Scanner;
public class InvertTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=sc.nextInt();
        char ch='a';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print(ch+" ");
                    ch++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

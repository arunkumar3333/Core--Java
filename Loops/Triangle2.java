package Loops;
import java.util.Scanner;
public class Triangle2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Rows: " );
        int num=sc.nextInt();
        char ch1='Y';
        char ch='A';
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i+j>=num+1){
                    System.out.print(ch1+" ");
                    ch1--;
                }else {
                    System.out.print("  ");
                }
            }
            for(int j=2;j<=num;j++){
                if(j<=i){
                    System.out.print(ch1+" ");
                    ch1--;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= i) {
                    System.out.print(ch+" ");
                    ch++;
                } else {
                    System.out.print("  ");
                }
            }
            for(int j=2;j<=num;j++){
                if(i+j<=num+1){
                    System.out.print(ch+" ");
                    ch++;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

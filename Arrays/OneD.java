package Arrays;

public class OneD {
    public static void main(String[] args) {
        int [] num={1,3,8,0,6,7,1};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        double avg= (double) sum /num.length;
        System.out.println("Sum of Array is: "+sum);
        System.out.println("Average of Array: "+avg);
    }
}

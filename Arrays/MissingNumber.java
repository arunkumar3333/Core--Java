package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,0,7,8};
        int n=arr.length;
        System.out.println("Length is: "+n);
        int expected=n*(n+1)/2;
        int actualsum=0;
        for(int num:arr){
            actualsum+=num;
        }
        int missingNo=expected-actualsum;
        System.out.println("Missing Number is: "+missingNo);
    }
}

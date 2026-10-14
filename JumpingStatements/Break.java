package JumpingStatements;

public class Break {
    public static void main(String[] args) {
        int num=5;
        int i=1;
        while(i<=num){

            if(i==3){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}

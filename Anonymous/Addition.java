package Anonymous;
interface inter{
    int add(int a,int b);
}
interface inter2{
    int sub(int a,int b);
}
public class Addition {
    public static void main(String[] args) {
    inter inherit=(int a,int b)->a+b; //to reduce number of lines we use lambda expressions
        System.out.println(inherit.add(4,9));
        inter2 obj=(int a, int b)->a-b;
        System.out.println(obj.sub(250,92));
    }
}

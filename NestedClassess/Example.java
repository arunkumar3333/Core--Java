package NestedClassess;
class Outer{
   private class Inner{
        void show(){
            System.out.println("I am inner class, Accessing  by creating method outside inner class but inside outer class\n" +
                    "and creating object for inner class inside created method(outer method)");
        }
    }
    void display(){
       Inner obj=new Inner();
       obj.show();
    }
}
public class Example {
    public static void main(String[] args) {
    Outer obj1=new Outer();
    obj1.display();
    }
}

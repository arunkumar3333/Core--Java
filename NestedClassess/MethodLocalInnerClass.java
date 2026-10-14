package NestedClassess;
class A{
    void method(){
        class b{
            void demo(){
                System.out.println("I am MethodLocal Inner Class");
            }
        }
        b obj=new b();
        obj.demo();
    }

    void hi(){
        System.out.println(".......");
    }
}
public class MethodLocalInnerClass {
    public static void main(String[] args) {
        A a=new A();
        a.method();
        A ob=new A(){
            void hi(){
                System.out.println("Hlo I am Anonymous Class");
            }
        };
        ob.hi();
    }
}

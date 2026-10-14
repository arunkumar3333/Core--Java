package Polymorphism;
class overriding{
    void mobile(String name,int ram, int rom){
        System.out.println("The parents mobile details...\n"+"Name: "+name+"\n"+"RAM: "+ram+" GB"+"\n"+"ROM: "+rom+" GB");
    }
}
class child extends overriding{

    void mobile(String name,int ram, int rom,String os){
        System.out.println("The Child mobile details...\n"+"Name: "+name+"\n"+"RAM: "+ram+" GB"+"\n"+"ROM: "+rom+" GB"+"\n"+"OS: "+os);
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
    child c=new child();
    c.mobile("Oppo K13",8,256,"MediaTek8500");
    c.mobile("Redmi note 10S",6,124);
    }
}

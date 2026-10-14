package Strings;

public class InBuiltMethods {
    public static void main(String[] args) {
        String name="Arun Kumar V";
        String course="Java Full Stack";
        System.out.println("Name Length: "+name.length());
        System.out.println("Lower Case(name): "+name.toLowerCase());
        System.out.println("Compare: "+name.compareTo(course));
        System.out.println("Course Length: "+course.length());
        System.out.println("UpperCase: "+course.toUpperCase());
        System.out.println("Start With A(name): "+name.startsWith("A"));
        System.out.println("Ends With k(course): "+course.endsWith("k"));
        System.out.println("CharAt: "+course.charAt(6));
        System.out.println("Substring Of Course: "+course.substring(5,11));
        System.out.println("Replacing name: "+name.replace("Kumar" , "Gowda"));
        System.out.println("Length: "+course.length());
        System.out.println("Trim (course): "+course.trim());
    }
}

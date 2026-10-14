package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class file {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:/Users/arung/OneDrive/Documents/EDUCATION_CERTIFICATES/Resume_PDF's/Deloitte.pdf");
            //FileReader reader=new FileReader("C:\Users\arung\IdeaProjects\CoreJava\src\Exceptions\demo.txt");
            int i;
            while((i=reader.read())!=-1){
                System.out.print((char) i);
            }
        }
        catch (FileNotFoundException f){
            System.out.println("File Not Found "+f);
        }
        catch (IOException i){
            System.out.println("Reading is not possible "+i);
        }
        try {
            int a=18;
            int b=0;
            int div=a/b;
            System.out.println(div);
        }
        catch (ArithmeticException a){
            System.out.println("Zero Division: "+a);
        }
    }
}

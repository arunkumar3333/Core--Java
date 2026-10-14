package Interfaces;
interface Notification{
    void message(String userName,String password);
}
class FaceBook implements Notification{
    @Override
    public void message(String user, String pass) {
        System.out.println("You Logged into FaceBook...\n"+"User Name: "+user+"\n"+"Password: "+pass);
    }
}
class DigiLocker implements Notification{
    @Override
    public void message(String user, String pass) {
        System.out.println("You Logged into DigiLocker and You can access ypur documents...\n"+"User Name: "+user+"\n"+"Password: "+pass);;
    }
}
class Snap implements Notification{
    @Override
    public void message(String user,String pass) {
        System.out.println("You Logged into Snap and you can view your friends...\n"+"User Name: "+user+"\n"+"Password: "+pass);
    }
}
public class Hirarchial_Inheritance {
    public static void main(String[] args) {
        FaceBook faceBook=new FaceBook();
        Snap snap=new Snap();
        DigiLocker digiLocker=new DigiLocker();
        faceBook.message("Arun Kumar V","Arun&5664");
        snap.message("Akash","Akash@5848");
        digiLocker.message("RAj","raja@4838");
    }
}


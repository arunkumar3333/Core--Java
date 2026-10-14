package Interfaces;
interface Notifications{
    void message(String msg);
}
class SMS implements Notifications{
    @Override
    public void message(String msg) {
        System.out.println("Your Login OTP is: "+msg);
    }
}
class WhatsApp implements Notifications{
    @Override
    public void message(String msg) {
        System.out.println("Thank you for shopping at KPN, Total Amount: "+msg);
    }
}
class Gmail implements Notifications{
    @Override
    public void message(String msg) {
        System.out.println("Thank you for taking the time to applying for the company, we appreciate. "+msg);
    }
}
public class SocialMedia {
    public static void main(String[] args) {
    SMS sms=new SMS();
    WhatsApp whatsApp=new WhatsApp();
    Gmail gmail=new Gmail();
    sms.message("74112");
    whatsApp.message("512 rs");
    gmail.message("Unfortunately we look forward with other candidates, we reach out you if any other roes suits with your profile");
    }
}

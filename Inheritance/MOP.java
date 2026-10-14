package Inheritance;
class Payment{
    String IFSC;
    String bankName;

    Payment(String ifsc,String bn){
        this.bankName=bn;
        this.IFSC=ifsc;
    }
    void show(){
        System.out.println("The Bank details are...\n"+"Name: "+bankName+"\n"+"IFSC code: "+IFSC);
    }
}
class UPI extends Payment{
    String referenceNumber;
    String appName;
    UPI(String ref,String an,String bn,String ifs){
        super(ifs,bn);
        this.appName=an;
        this.referenceNumber=ref;
    }
    void display(){
        super.show();
        System.out.println("The MOP is UPI and details are..\n"+"Reference Number: "+referenceNumber+"\n"+"App name: "+appName);
    }
}
class Card extends Payment{
    long cardNumber;
    String transactionId;
    Card(long cn, String ti,String ifs,String bn){
        super(ifs,bn);
        this.cardNumber=cn;
        this.transactionId=ti;
    }
    void show1(){
        super.show();
        System.out.println("Card Payment details are...\n"+"Card Number: "+cardNumber+"\n"+"Transaction ID: "+transactionId);
    }
}
public class MOP {
    public static void main(String[] args) {
    UPI upi=new UPI("KA07589589","GPay","Canara","CNRB0097");
    Card card=new Card(12345678905L,"cn09585","CNRb589589","HDFC");
    upi.display();
    System.out.println();
    card.show1();
    }
}

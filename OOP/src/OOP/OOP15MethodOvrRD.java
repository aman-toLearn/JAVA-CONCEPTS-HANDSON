package OOP;

class Bank{
    public  void rateOfInterest(){
        System.out.println("generally interest 5%");
    }
}

class Sbi extends Bank{
    public  void rateOfInterest(){
        System.out.println("i am SBI 7%");
    }
}

class PNB extends Bank{
    public  void rateOfInterest(){
        System.out.println("i am PNB 6%");
    }

}
public class OOP15MethodOvrRD {

    public static void main(String[] args){
       Bank b = new Bank();
       Sbi s = new Sbi();
       PNB p  = new PNB();
       b.rateOfInterest();
       s.rateOfInterest();
       p.rateOfInterest();
    }
}

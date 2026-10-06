interface  Payment{
    void pay(double amount);

}
class upi implements Payment{
    public void pay(double amount){
        System.out.println("paid "+amount+" using upi");
    }
}
class creditCard implements Payment{
    public void pay(double amount){
        System.out.println("paid "+ amount +" using credit card");
    }
}

public class paymentSystem {
    public static void main(String[] args) {
        upi u=new upi();
        u.pay(50000);

        creditCard c=new creditCard();
        c.pay(1000);


    }
}

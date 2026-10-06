class Account{
    int accnumber;
    double balance;

    public Account(int accnumber,double balance) {
        this.accnumber=accnumber;
        this.balance=balance;
    }
    void withdraw(double amount){
        System.out.println("withdrawal from bank account");
    }
    
}
class savings extends Account{

    savings(int accnumber,double balance){
        super(accnumber, balance);
    }

    void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Savings withdrawal successfull");
            System.out.println("Remaining balance "+ balance);
        }
        else{
            System.out.println("insufficient balance");
        }
    }


}
class current extends Account{
    current(int accnumber,double balance){
        super(accnumber,balance);
    }
    void withdraw(double amount){
        balance=balance-amount;
        System.out.println("current account withdrawal successful");
        System.out.println("Remaining balance "+balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        savings s=new savings(101,5000);
        s.withdraw(2000);

        current c=new current(102,56000);
        c.withdraw(200);

    }
}

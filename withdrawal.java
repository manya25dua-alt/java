import java.util.Scanner;
class MyException extends Exception{
    char type;
    MyException(char type){
        this.type=type;
    }
    
}
public class withdrawal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int amount=sc.nextInt();
        try{
            if(amount<=0){
                throw new MyException('a');
            }
            if(amount>balance){
                throw new MyException('b');
            }
            System.out.println("Withdrawal successful .");
            int remaining=balance-amount;
            System.out.println(remaining);

        
        }
        catch (MyException e){
            if(e.type=='a'){
                System.out.println("invalid amount");
            }
            if(e.type=='b'){
                System.out.println("insufficient balance");
            }
        }
    }
}

import java.util.Scanner;
class AgeException extends Exception{

}
public class AgeValidator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        try{
           if(age<18){
            throw new AgeException ();

           } 
           System.out.println("valid age");
        }
        catch(AgeException e){
            System.out.println("invalid:- age must be greater than 18");
        }
        sc.close();
    }
}

import java.util.Scanner;
class PasswordException extends Exception{
    char type;
    PasswordException(char type){
        this.type=type;

    }
}
public class Password {
    static void validatePassword(String password) throws PasswordException {
        try{
            if(password.length()<8){
                throw new PasswordException('d');
            }
            boolean upper=false;
            boolean lower=false;
            boolean digit=false;
            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);
                if(Character.isUpperCase(ch)){
                    upper=true;

                }
                if(Character.isLowerCase(ch)){
                    lower=true;

                }
                if(Character.isDigit(ch)){
                    digit=true;

                }
                if(!upper || !lower || !digit){
                    throw new PasswordException('s');

                }
            }
            System.out.println("Valid password");
        }
        catch(PasswordException e){
            if(e.type=='d'){
                System.out.println( "Invalid password: Password length is less than 8 characters.");
            }
            if(e.type=='s'){
                System.out.println("Invalid password: Password must contain at least one uppercase letter, one lowercase letter, one digit.");
            }

        }

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String password=sc.nextLine();
            try{
                validatePassword(password);

            }
            catch(PasswordException e){

            }
        }
        sc.close();
    }
}


import java.util.Scanner;
public class Asciii {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String str=sc.nextLine();
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch==' '){
                   sb.append(" ");
                }
                else{
                    sb.append((int) ch);
                }
            }
            System.out.println(sb);
        }
        sc.close();
    }
    
}

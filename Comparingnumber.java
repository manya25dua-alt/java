import java.util.Scanner;
public class Comparingnumber {
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int n=sc.nextInt();
            int original=n;
            int reverse=0;
            while(n>0){
                int rem=n%10;
                reverse=reverse*10+rem;
                n=n/10;
                
            }
            if(original==reverse){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }
        }
    }
}

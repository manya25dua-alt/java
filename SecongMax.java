import java.util.Scanner;
public class SecongMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
               
                secondmax=max;
                max=a[i];

            }
            else if(a[i]>secondmax && a[i]!=max){
                secondmax=a[i];
            }
            
        }
        if(secondmax==Integer.MIN_VALUE){
            System.out.println("1");
        }
        else{
            System.out.println(secondmax);
        }
    }
}

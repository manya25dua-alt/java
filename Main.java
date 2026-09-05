import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int count=0;
        int arr[]=new int[7];
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();

        }
        int n= sc.nextInt();
        for(int i=0;i<7;i++){
            if(arr[i]==n){
                count++;
            }
        }
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("Not Present");
        }
    }
    
}

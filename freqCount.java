
import java.util.HashSet;
import java.util.Scanner;
public class freqCount {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    HashSet <Integer> num= new HashSet<Integer>();
    for(int x:arr){
        num.add(x);

    }
    for(int a:num){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
        }
         System.out.println(num + " occurs " + count + " times");
    }

    }
}

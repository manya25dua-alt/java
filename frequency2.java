import java.util.Scanner;
public class frequency2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] n={10,20,30,40,50,40,20,20};
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<n.length;i++){
            if(num==n[i]){
                count++;
            }
        }
        System.out.println(num+" occurs "+count+" times.");
    }
}

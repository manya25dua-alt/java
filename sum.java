import java.util.Scanner;
public class sum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //LOWER MATRIX
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                sum+=sum+matrix[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

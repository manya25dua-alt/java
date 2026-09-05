import java.util.Scanner;
public class SumMatrix {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int r=sc.nextInt();
        int c= sc.nextInt();
        int matrix[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        int sum=0;
        for(int j=0;j<c;j++){
            sum=sum+matrix[k][j];
        }
        System.out.println(sum);
    }

    
}

import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] n={10,20,20,30,40};
        boolean[] visited=new boolean[n.length];
        for(int i=0;i<n.length;i++){
            int count=0;
            if(visited[i]){
                continue;
            }
            for(int j=0;j<n.length;j++){
                if(n[i]==n[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(n[i]+" occurs "+count+" times.");
        }
    }
}


import java.util.*;

public class even {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashSet<Integer> num=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        Iterator<Integer> it=num.iterator();
        while(it.hasNext()){
            int x=it.next();
            if(x%2==0){
                System.out.print(x+" ");
            }
        }
    }
    
}

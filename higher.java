import java.util.*;

public class higher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer> num= new TreeSet<Integer>(); 
            for(int i=0;i<n;i++){
                num.add(sc.nextInt());
            }
            int x=sc.nextInt();
            System.out.println(num.higher(x));  
        
    }
}

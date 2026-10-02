import java.util.*;
public class insert {
    public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
     int n=sc.nextInt();
     LinkedHashSet <Integer> num= new LinkedHashSet<>();
        for(int i=0;i<n;i++){
num.add(sc.nextInt());

        }
        for(int x:num){
            System.out.println(x);
        }
    }
    
}

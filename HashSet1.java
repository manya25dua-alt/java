import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        System.out.println(set1);
        System.out.println(set1.add(10));//it will give false because no duplicate values are allowed in hashset
        set1.remove(20);
        System.out.println(set1.contains(10));
        System.out.println(set1.size());
        set1.clear();   //it will delete the whole set
        System.out.println(set1.isEmpty());   //it will give yes because set is empty


        //HashSet traversing
        for(int x : set1){
            System.out.println(x);
        }
    }
}
//it automatically removes duplicate values



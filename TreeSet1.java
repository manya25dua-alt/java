import java.util.*;
public class TreeSet1 {
    public static void main(String[] args){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(40);
        System.out.println(set);

        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.higher(30));  //give the next greater element

        System.out.println(set.lower(30));     //gives the next smaller element

        System.out.println(set.pollFirst());  //returns and removes the smallest number
        System.out.println(set.pollLast());         //it will return the largest number

        System.out.println(set.descendingSet());
        System.out.println(set);

    }
    
}
//it will always give outpit in ascending order
//it will automatically removes the duplicate values

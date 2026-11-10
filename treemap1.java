import java.util.*;
public class treemap1 {
    public static void main(String[] args){
        Map<Integer,String> mapp=new TreeMap<>();
        mapp.put(101,"Manya");
        mapp.put(102,"Rahul");
        mapp.put(104,"Riya");
         mapp.put(103,"Rohit");
        System.out.println(mapp.entrySet());
    }
    
}
//it will always give answer in ascending order and does not allow null value in natural ordering
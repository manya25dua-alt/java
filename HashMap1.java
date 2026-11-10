import java.util.*;
public class HashMap1 {
    public static void main(String[] args){
        Map<Integer,String> mapp=new HashMap<>();
        mapp.put(101,"Manya");
        mapp.put(102,"Rahul");
        mapp.put(103,"Rohit");
        mapp.put(104,"Riya");
        for(Map.Entry<Integer,String> ent:mapp.entrySet()){
            System.out.println(ent.getKey());
            System.out.println(ent.getValue());
            
        }
        System.out.println(mapp.entrySet());
        System.out.println(mapp.keySet());
        System.out.println(mapp.values());
    }
    
}
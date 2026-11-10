import java.util.*;
public class FreqHashMap {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,1,4,2,5,3,3,4,5,3};
        Map<Integer,Integer> mapp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mapp.containsKey(arr[i])){
                mapp.put(arr[i],mapp.get(arr[i])+1);
            }
            else{
                mapp.put(arr[i],1);
            }
        }
       for(Map.Entry<Integer, Integer> ent : mapp.entrySet()) {
    System.out.println(ent.getKey() + " occurs " + ent.getValue() + " times.");
}
    }
}

import java.util.*;
public class ArrayList1{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr.get(2));
        arr.add(1,90);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);


        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.addFirst(90);
        list1.addLast(50);
        System.out.println(list1);

        list1.remove(1);
        list1.removeLast();
        System.out.println(list1);

    }
}

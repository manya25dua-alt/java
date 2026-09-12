import java.util.*;

class FrequencyArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);

        HashSet<Integer> set = new HashSet<>(list);

        for (int x : set) {

            int count = 0;

            for (int y : list) {
                if (x == y) {
                    count++;
                }
            }

            System.out.println(x + " = " + count);
        }
    }
}
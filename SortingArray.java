import java.util.ArrayList;
import java.util.Collections;
public class SortingArray {
    public static void main(String[] args) {        
        // =====================================================================
        // PART 2: USING AN ARRAYLIST
        // =====================================================================
        System.out.println("\n--- ARRAYLIST OPERATIONS ---");
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(12);
        list.add(89);
        list.add(7);
        list.add(23);
        list.add(56);
        System.out.println("Original ArrayList: " + list);
        
        // 1. Min and Max (Uses Collections utility methods)
        int minList = Collections.min(list);
        int maxList = Collections.max(list);
        System.out.println("Min Value: " + minList);
        System.out.println("Max Value: " + maxList);
        
        // 2. Sort (Uses Collections.sort or list.sort)
        Collections.sort(list);
        System.out.println("Sorted ArrayList (Ascending): " + list);
        
        // 3. Reverse (Uses Collections.reverse utility)
        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);
    }
}
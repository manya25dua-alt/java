import java.util.Arrays;

public class StandardArray {
    public static void main(String[] args) {
        
        // =====================================================================
        // PART 1: USING A STANDARD ARRAY
        // =====================================================================
        System.out.println("--- STANDARD ARRAY OPERATIONS ---");
        
        int[] normalArray = {45, 12, 89, 7, 23, 56};
        System.out.println("Original Array: " + Arrays.toString(normalArray));
        
        // 1. Min and Max (Requires manual loop iteration or Java Streams)
        int minArray = normalArray[0];
        int maxArray = normalArray[0];
        for (int num : normalArray) {
            if (num < minArray) minArray = num;
            if (num > maxArray) maxArray = num;
        }
        System.out.println("Min Value: " + minArray);
        System.out.println("Max Value: " + maxArray);
        
        // 2. Sort (Uses Arrays.sort utility utility)
        Arrays.sort(normalArray);
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(normalArray));
        
        // 3. Reverse (Requires a manual loop swapping elements from both ends)
        for (int i = 0; i < normalArray.length / 2; i++) {
            int temp = normalArray[i];
            normalArray[i] = normalArray[normalArray.length - 1 - i];
            normalArray[normalArray.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(normalArray));
    }
}
public class repeatedValue {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 10};

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            // Check if this value appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            // Print only the first occurrence
            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
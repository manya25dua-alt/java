
import java.util.*;

class LastLetterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char last = str.charAt(str.length() - 1);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            }
        }

        System.out.println("Last letter: " + last);
        System.out.println("Frequency: " + count);
    }
}

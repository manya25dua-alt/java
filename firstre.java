import java.util.*;

public class firstre {
    public static void main(String[] args) {

        String str = "programming";

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {

            if (set.contains(ch)) {
                System.out.println("First repeated character: " + ch);
                break;
            }

            set.add(ch);
        }
    }
}
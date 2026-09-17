import java.util.*;

public class Unique {
    public static void main(String[] args) {

        String str = "programming";

        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        System.out.println("Unique characters: " + set);
    }
}
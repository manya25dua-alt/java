
import java.util.Scanner;

public class nonrepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.println(i);
                sc.close();
                return;
            }
        }

        System.out.println(-1);
        sc.close();
    }
}

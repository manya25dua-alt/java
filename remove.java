import java.util.HashSet;
import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }

        int m = sc.nextInt();

        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < m; i++) {
            set2.add(sc.nextInt());
        }
        set1.removeAll(set2);
        System.out.println(set1);
    }
}

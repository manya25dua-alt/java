import java.util.*;

class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int pos = sc.nextInt();

        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position");
            return;
        }

        for (int i = pos; i < n - 1; i++)
            a[i] = a[i + 1];

        a[n - 1] = 0;

        for (int x : a)
            System.out.print(x + " ");
    }
}

import java.util.*;

class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        boolean identity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && a[i][j] != 1)
                    identity = false;
                if (i != j && a[i][j] != 0)
                    identity = true;
            }
        }

        if (identity)
            System.out.println("Identity matrix");
        else
            System.out.println("Not an identity matrix");
    }
}
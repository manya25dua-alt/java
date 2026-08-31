public class Strings {
    public static void main(String args[]) {

        // REPLACE A CHARACTER
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'l') {
                sb.setCharAt(i, 'm');
            }
        }

        System.out.println(sb);
    }
}
import java.util.Scanner;

class CustomException extends Exception {
    private String msg;

    public CustomException(String message) {
        this.msg = message;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}

class customExcep {

    static int power(int num, int exp) throws CustomException {

        if (num < 0 || exp < 0) {
            throw new CustomException("Negative numbers not allowed");
        }

        if (num == 0 && exp == 0) {
            throw new CustomException("Both can never be zero");
        }

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int exp = sc.nextInt();

        try {
            System.out.println(power(num, exp));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
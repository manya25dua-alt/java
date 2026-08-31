public class StringsPallindrome {
    public static void main(String args[]){
        // STRING PALLINDROME IN JAVA
        String str="hello";
        StringBuilder sb= new StringBuilder(str);
        String reversed = sb.reverse().toString();
        if(str==reversed){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}

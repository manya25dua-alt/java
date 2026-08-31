public class ReverseEcahWord {
    public static void main(String args[]){
        //REVERSE EACH WORD OF A SENTENCE
        String str=" java is a fun";
        String[] words=str.split(" ");
        
        StringBuilder result= new StringBuilder();
        for(String i:words){
            StringBuilder sb= new StringBuilder(i);
            result.append(sb.reverse().append(" "));
        }
        System.out.println(result);
    }
}

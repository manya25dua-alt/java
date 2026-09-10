public class LongestWord{
    public static void main(String args[]){
         String input="I love javaProgramin language";
        String[] words=input.split(" ");
        String longest="";
        for(String word:words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        System.out.println(longest);
    }
}
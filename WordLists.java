import java.util.*;
public class WordLists{
    public static void main(String args[]){
        String sentence="java java python collection java";
        String[] words=sentence.split("\\s+");

        ArrayList<String> wordList=new ArrayList<String>();
        LinkedHashSet<String> Unique= new LinkedHashSet<>();
        HashMap<String,Integer> frequency=new HashMap<>();

        for(String word:words){
            wordList.add(word);
            Unique.add(word);
            frequency.put(word,frequency.getOrDefault(word,0)+1);

        }
        System.out.println("Word List: "+wordList);
        System.out.println("Unique Words: "+Unique);
        System.out.println("frequency of words: "+frequency);

        String mostfrequent=null;
        int max=0;
        for(Map.Entry<String,Integer> e: frequency.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                mostfrequent=e.getKey();
            }
        }
        System.out.println("Most frequent word: "+ mostfrequent+" "+ max+" times");



    }
}
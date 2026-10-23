public class String3 {
    public static void main(String[] args) {
        String str="get better at coding";
        String[] words=str.trim().split("//s+");
        String result=" ";

        for(int i=0;i<words.length;i++){
            result+=Character.toUpperCase(words[i].charAt(0))+words[i].substring(1);
        
        if(i<words.length-1){
            result+=" ";
        }
    }
        System.out.println(result);
        
    }
}

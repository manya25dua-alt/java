import java.util.Scanner;
class resultException extends Exception{
    char type;
    resultException(char type){
        this.type=type;
    }
}
public class result {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] marks=new int[5];
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();

        }
        int sum=0;

        try{
            for(int i=0;i<5;i++){
                sum+=marks[i];

            }
            if(sum<0){
                throw new resultException('n');

            }
            if(sum>100){
                throw new resultException('h');

            }
            if(sum>33){
                throw new resultException('f');
            }
        }
        catch(resultException e){
            if(e.type=='a'){
                System.out.println("Invalid marks: Marks cannot be negative");
            }
            if(e.type=='h'){
                System.out.println("Invalid Marks: Marks cannot be greater than 100");
            }
            if(e.type=='f'){
                System.out.println("Student failed: Marks are less than 33 is one or more subjects.");
            }
        }
        sc.close();
        
        
    }
}

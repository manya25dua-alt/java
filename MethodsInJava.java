class example{
    public void PlayMusic(){   //this is the first method
            System.out.println("Music playing");
    }
    public String GetMeAPen(int cost ){         //this is the second method
        if(cost>=10){
        return "Pen";
        }
        return "nothing";
    }
}


public class MethodsInJava{
    public static void main(String a[]){
        example obj=new example();  //this is a object 
        obj.PlayMusic();
        String str=obj.GetMeAPen(2);
        System.out.println(str);
    }
}
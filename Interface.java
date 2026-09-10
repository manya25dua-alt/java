interface Animal{
    void Sound();

    }
class dog implements Animal{
    public void Sound(){
        System.out.println("Dog barks");
    }
}
class cat implements Animal{
    public void Sound(){
        System.out.println("cat meows");
    }
}


public class Interface{
    public static void main(String args[]){
        dog d= new dog();
        cat c=new cat();

        d.Sound();
        c.Sound();
    }
}
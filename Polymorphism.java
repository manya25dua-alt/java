class a{                  //parent class
    public void show(){

    
    System.out.println("Hello");
    }
}  
class b extends a{            //child class(extended version of parent class so we can access the methods of class a)
    public void show(){
        System.out.println("bye");
    }
}

public class Polymorphism {
    public static void main(String args[]){
            // a obj=new b();
            a obj= new a();
            obj.show();
            obj=new b();

            obj.show();
    }
}

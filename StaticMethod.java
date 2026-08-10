class Mobile{
    String brand;
    int price;
    static String name;


public void show(){
     System.out.println(brand +" " + price + " " + name );
}
public static void show1(Mobile obj){                                    //this is the static method 
    System.out.println(obj.brand +" " + obj.price + " " + name );       // as name is already a static variable we dont have to write obj to access tha name
}
}

public class StaticMethod {
          public static void main(String a[]){
            Mobile obj1=new Mobile();
            obj1.brand="Apple";
            obj1.price=100000;
            Mobile.name="smartphone";   // as it is a static variable we can call this by using classname
            Mobile obj2=new Mobile();
            obj2.brand="Samsung";
            obj2.price=12000;
            Mobile.name="smartphone";
            obj1.show();
            Mobile.show1(obj2);
          }   
}


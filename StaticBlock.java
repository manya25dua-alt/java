class Mobile{
    String brand;
    int price;
    static String name;


static{
    name="phone";       //static block can be created only once irrespective of how many object we have created  
    System.out.println("static block is called");  //static block will be always called first 
}

public Mobile(){      //constructor 
    brand="";
    price=200;         //by default the price and brand will be this 

}
public void show(){
    System.out.println(brand +" " + price + " " + name );
}


}

public class StaticBlock {
    public static void main(String a[]){
      Mobile obj1 = new Mobile();
    //   obj1.brand="Apple";
    //  obj1.Price=10000;
    //  Mobile.name="Smartphone";   
     obj1.show();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }

}
class dog extends Animal{
    void bark(){
        System.out.println("Animal is barking");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        dog d= new dog();
        d.bark();
        d.sleep();
        d.eat();

    }
}

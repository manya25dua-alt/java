class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("Meowing");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

public class hieraricalInherit {
    public static void main(String[] args) {
        dog d=new dog();
        cat c=new cat();
        d.bark();
        d.eat();
        c.eat();
        c.meow();
    }
}

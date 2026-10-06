abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    void eat() {
        System.out.println(name + " is eating");
    }
}

class dog extends Animal {

    dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " barks");
    }
}
class cat extends Animal{
    cat(String name){
        super(name);
    }
    void sound(){
        System.out.println(name+" is meowing");
    }
}
public class Abstract {
    public static void main(String[] args) {
        // dog a=new dog("dog");
        // a.eat();
        // a.sound();
        cat c= new cat("cat");
        c.eat();
        c.sound();

    }
}

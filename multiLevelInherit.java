class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class dog extends Animal{
    void sleep(){
        System.out.println("dog is sleeping");
    }
}
class puppy extends dog{
    void bark(){
        System.out.println("puppy is barking");
    }
}


public class multiLevelInherit {
    public static void main(String args[]){
        puppy p=new puppy();
        p.eat();
        p.bark();
        p.sleep();

    }
}

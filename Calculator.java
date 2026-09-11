class calc{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;

    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a, double b){
        return a*b;
    }
}
public class Calculator{
    public static void main(){
        calc c= new calc();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10.5,20.5));
        System.out.println(c.add(10,20,30));
        System.out.println(c.multiply(5,4));
        System.out.println(c.multiply(2.5,4.0));
    }
}
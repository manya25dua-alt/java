import java.util.Scanner;
class AreaOfShapes{
    double area(){
        return 0;
    };
}
class circle extends AreaOfShapes{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
class rectangle extends AreaOfShapes{
    double length;
    double breadth;

    public rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;

    }
    @Override 
    double area(){
        return length*breadth;
    }
    
}
class triangle extends AreaOfShapes{
    double base;
    double height;
    triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    double area(){
        return 1/2*base*height;
    }
}
public class AreaCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        AreaOfShapes s;
        if(type==1){
           double radius=sc.nextDouble();
           s=new circle(radius);


        }
        else if (type == 2) {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            s = new rectangle(length, width);
        } else {
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            s = new triangle(base, height);
        }

        System.out.printf("Area: %.2f%n", s.area());

        sc.close();
    }
}

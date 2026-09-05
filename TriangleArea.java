import java.util.Scanner;
class Triangle {
    int base;
    int height;
    // Instance Variables
    

    // Default Constructor
    Triangle() {
    this.base=0;
    this.height=0;
    
       
    }

    // Stores the base and height
    void setBaseHeight(int b, int h) {
       this.base=b;
       this.height=h;
        
        
    }

    // Returns the base
    int getBase() {
         return this.base;
        
       
    }

    // Returns the height
    int getHeight() {
        return this.height;
      
        
    }

    // Returns the area of the triangle
    float area() {
return 0.5f*this.base*this.height;
        
       
    }
}
public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int height = sc.nextInt();

        Triangle t = new Triangle();

        t.setBaseHeight(base, height);

        System.out.println(t.getBase());
        System.out.println(t.getHeight());
        System.out.println(t.area());
    }
}

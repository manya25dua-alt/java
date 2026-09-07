import java.util.*;
public class cars {
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);
        HashMap<Integer,String> cars=new HashMap<>();
        cars.put(101, "Thar");
        cars.put(102, "Fortuner");
        cars.put(103, "Wrangler");
        cars.put(104, "Gurkha");
        cars.put(105, "Rubicon");

        System.out.print("Enter car name: ");
        String car=sc.nextLine();
        boolean found=false;
         for(String name:cars.values()){
            if(name.equalsIgnoreCase(car)){
                found=true;
                break;
            }
         }
         if(found){
            System.out.println("CAR IS AVAILABLE");
         }
         else{
            System.out.println("SORRY, CAR IS NOT AVAILABLE");
         }

        sc.close();
    }
}

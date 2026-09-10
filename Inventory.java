import java.util.LinkedHashMap;

public class Inventory{
    public static void main(String args[]){
        LinkedHashMap<Integer,Integer> inventory= new LinkedHashMap<>();
        inventory.put(101,20);
        inventory.put(102,20);
        inventory.put(103,20);
        inventory.put(104,20);
        inventory.put(105,20);
        inventory.put(106,20);

        System.out.println("Initial inventory :"+inventory);
        inventory.put(103,inventory.get(103)+70);
        System.out.println(inventory);

        //to check whether we have the product or not
        int checkId=104;
        System.out.println("Stock of "+ checkId+" is"+ inventory.get(checkId));


        //to find the highest stock in our inventory
        int highest_stock=-1;
        int highest_product=-1;
        for(Map.Entry<Integer,Integer> e: inventory.entrySet()){
            if(e.getValue()>highest_stock){
                highest_stock=e.getValue();
                highest_product=e.getKey();
            }
        }
        System.out.println("After update/removal: " + inventory);
        System.out.println("Highest Stock Product: " + highestProduct + " (" + highestStock + " units)");

       

    }
}
class BillingSystem{
    String customerName;
    int unitconsumed;

     BillingSystem(String customerName,int unitconsumed){
        this.customerName=customerName;
        this.unitconsumed=unitconsumed;
    }
    double calculateBill(){
        double charge;
        if(unitconsumed<=100){
            charge=unitconsumed*2;
        }
        else if(unitconsumed<=200){
            charge=(100*2)+(unitconsumed-100)*4;
        }
        else{
            charge=(100*2)+(100*4)+(unitconsumed-200)*6;
        }
        return charge+150;
    }

    //total charge excluding the fixed charge of 150 rs
    double ElectricEnergyCharge(){
        double energy;
         if(unitconsumed<=100){
            energy=unitconsumed*2;
        }
        else if(unitconsumed<=200){
            energy=(100*2)+(unitconsumed-100)*4;
        }
        else{
            energy=(100*2)+(100*4)+(unitconsumed-200)*6;
        }
        return energy;


    }
    void display(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("units Consumed: "+unitconsumed);
        System.out.println("Energy Charge: "+ElectricEnergyCharge());
        System.out.println("Fixed charge: 150");
        System.out.println("Total Bill: "+calculateBill());
    }
    
}
public class Electricity {
    public static void main(String[] args) {
        BillingSystem b = new BillingSystem("Rahul",250);
        b.display();

    }
}

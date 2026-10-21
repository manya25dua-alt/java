import java.util.Scanner;
class Employee{
   String name;
   int id;

    public Employee(String name,int id) {
        this.name=name;
        this.id=id;
    }
   
}
class FullTime extends Employee{
    double salary;
    double bonus;
    FullTime(String name,int id,double salary,double bonus){
        super(name,id);
        this.salary=salary;
        this.bonus=bonus;
    }
    double salary(){
        return salary+bonus;
    }

}
class PartTime extends Employee{
    int hours;
    int hourly_rate;
    PartTime(String name,int id,int hours,int hourly_rate){
        super(name,id);
        this.hours=hourly_rate;
        this.hourly_rate=hourly_rate;
    }
    int salary(){
        return hours*hourly_rate;
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        String name=sc.nextLine();
        int id=sc.nextInt();

        if(type==1){
            double bonus=sc.nextDouble();
            double salary=sc.nextDouble();
            FullTime f=new FullTime(name,id,salary, bonus);
            System.out.println("name "+f.name);
            System.out.println("id "+f.id);
            System.out.println("Total Salary "+f.salary());
        } else if (type == 2) {
            int hours = sc.nextInt(id);
            int hourly_rate = sc.nextInt();

            PartTime emp =
                new PartTime(name, id, hours, hourly_rate);

            System.out.println("Employee Name: " + emp.name);
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Salary: " + emp.salary());
        }

    }
}

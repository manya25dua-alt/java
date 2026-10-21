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
        FullTime f = new FullTime("Manya", 101, 50000, 2000);

System.out.println("Name: " + f.name);
System.out.println("ID: " + f.id);
System.out.println("Salary: " + f.salary());

PartTime p = new PartTime("Manya", 101, 5, 5000);

System.out.println("Name: " + p.name);
System.out.println("ID: " + p.id);
System.out.println("Salary: " + p.salary());
    }
}

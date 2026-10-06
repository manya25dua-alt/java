class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;

    }
    void displaySalary(){
        System.out.println(name+" salary "+ salary);
    }

}
class manager extends Employee{
    manager(String name,int salary){
        super(name, salary);
    }
    void displaySalary(){
        System.out.println(name+" Manager Salary "+ (salary+100000));
    }
}
class developer extends Employee{
    developer(String name,int salary){
        super(name, salary);
    }
    void displaySalary(){
        System.out.println(name+" Developer salary "+(salary+5000));
    }
}
    public class company {
    public static void main(String[] args) {
        manager m=new manager("Manya",10000);
        developer d=new developer("Rohit",50000);
        m.displaySalary();
        d.displaySalary();
    }
}

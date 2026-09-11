class Employee{
    private int empid;
    private String name;
    private int salary;
    Employee(int empid,String name,int salary){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
    }
    public int getempid(){
        return empid;
    }
    public String getName(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
    public void display(){
        System.out.println(empid+" "+name+" "+salary);
    }
}
public class Emp{
   public static void main(String[] args) {
    Employee[] e={
        new Employee(101,"manya",50000),
        new Employee(102,"Arun",70000),
        new Employee(103,"kumar",90000),
        new Employee(104,"Suresh",56000)
    };
    double max=Double.MIN_VALUE;
    double second=Double.MIN_VALUE;
    int total=0;
    for(Employee emp:e){
        double salary= emp.getsalary();
        total+=salary;    //for average
        if(salary>max){
            max=salary;
            second=max;
        }
        else if(salary>second && salary<max){
            second=salary;
        }
    }
    System.out.println("Second highest salary: "+ second);
    for(Employee emp:e){
        if(emp.getsalary()==second){
            emp.display();
        }
       
    }
     System.out.println("average salary: "+total/e.length);
}
}

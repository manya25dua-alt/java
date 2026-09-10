import java.util.*;
class Employee{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        TreeSet <Integer> emp= new TreeSet<>();
        emp.add(101);
        emp.add(102);
        emp.add(103);
        emp.add(105);
        emp.add(101);
        emp.add(102);
        emp.add(104);

        System.out.println("Unique employeeId's: "+ emp);
        System.out.println("Unique count: "+emp.size());

        int SearchID=sc.nextInt();
        System.out.println("contains "+ SearchID+" "+ emp.contains(SearchID));

        emp.remove(105);
        System.out.println("After remove 105 remaining are: "+emp);
        System.out.println("SmallestId "+emp.first());
        System.out.println("LargestId "+emp.last());

    }
}
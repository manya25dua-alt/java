class EmployeeSalary {
    private int empId;
    private String name;
    private double basicSalary;

    EmployeeSalary(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() { return basicSalary; }
    double calculateSalary(double bonus) { return basicSalary + bonus; }
    double calculateSalary(double bonus, double allowance) {
        return basicSalary + bonus + allowance;
    }

    void display() {
        System.out.println(empId + " " + name +
            " Basic Salary=" + basicSalary);
    }
}

public class SalaryDemo {
    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary(101, "Arun", 50000);

        e.display();
        System.out.println("Salary = " + e.calculateSalary());
        System.out.println("Salary + Bonus = " + e.calculateSalary(5000));
        System.out.println("Salary + Bonus + Allowance = " +
            e.calculateSalary(5000, 3000));
    }
}

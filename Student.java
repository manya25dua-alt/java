import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    public int Rollno;
    public String Name;
    public double cgpa;

    public Student(int Rollno, String Name, double cgpa) {
        this.Rollno = Rollno;
        this.Name = Name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return Rollno + " " + Name + " " + cgpa;
    }
}

public class Main1 {
    public static void main(String[] args) {

        ArrayList<Student> Stud = new ArrayList<Student>();

        Stud.add(new Student(101, "Ram", 99.99));
        Stud.add(new Student(102, "Kumar", 90.99));
        Stud.add(new Student(103, "Ayush", 87.66));
        Stud.add(new Student(104, "Bala", 78.66));

        Collections.sort(Stud, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.cgpa, s2.cgpa);
            }
        });

        System.out.println(Stud);
    }
}

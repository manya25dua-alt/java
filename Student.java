import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class main {
    public int Rollno;
    public String Name;
    public double cgpa;

    public main(int Rollno, String Name, double cgpa) {
        this.Rollno = Rollno;
        this.Name = Name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return Rollno + " " + Name + " " + cgpa;
    }
}

public class Student {
    public static void main(String[] args) {

        ArrayList<main> Stud = new ArrayList<main>();

        Stud.add(new main(101, "Ram", 99.99));
        Stud.add(new main(102, "Kumar", 90.99));
        Stud.add(new main(103, "Ayush", 87.66));
        Stud.add(new main(104, "Bala", 78.66));

        Collections.sort(Stud, new Comparator<main>() {
            public int compare(main s1, main s2) {
                return Double.compare(s1.cgpa, s2.cgpa);
            }
        });

        System.out.println(Stud);
    }
}

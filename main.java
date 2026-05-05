import java.util.*;
class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ravi"));
        list.add(new Student(2, "Priya"));
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
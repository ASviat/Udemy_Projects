import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ann"));
        list.add(new Student("ANN"));
        list.add(new Student("BOB"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        AnotherComparator ac = new AnotherComparator();
        Student[] students = {new Student("Olga"), new Student("Mike"), new Student("OLGA")};
        System.out.println(Arrays.toString(students));

        Arrays.sort(students,ac);
        System.out.println(Arrays.toString(students));
    }
}

class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }
}

class AnotherComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

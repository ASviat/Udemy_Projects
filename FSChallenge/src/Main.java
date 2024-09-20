import model.LPAStudent;
import model.PercentageComparator;
import model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        printMoreLists(students);

        students.sort(Comparator.reverseOrder());
        printMoreLists(students);
        students.sort(Comparator.naturalOrder());
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        lpaStudents.add(new LPAStudent());
        lpaStudents.get(10).setPercentComplete(50);

        printMoreLists(lpaStudents);

        Comparator<LPAStudent> percentageSorter = new PercentageComparator();
        lpaStudents.sort(percentageSorter.reversed());
        printMoreLists(lpaStudents);

        for (var i : lpaStudents) {
            if(i.matchFieldValue("percentcomplete","50")){
                System.out.println(i);
            }
        }
    }

    public static void printMoreLists(List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }


}


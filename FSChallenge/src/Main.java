import model.LPAStudent;
import model.PercentageComparator;
import model.Student;
import util.QueryList;

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

        printMoreLists(lpaStudents);

        Comparator<LPAStudent> percentageSorter = new PercentageComparator();
        lpaStudents.sort(percentageSorter.reversed());
        printMoreLists(lpaStudents);


        var queryList = new QueryList<>();



    }


    public static void printMoreLists(List<? extends Student> students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {

        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//    public static void testList(List<String> list) {
//
//        for (var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//
//        for (var element : list) {
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }

//    public static <T extends Student> void printList(List<T> students) {
//
//        for (var student : students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }
}


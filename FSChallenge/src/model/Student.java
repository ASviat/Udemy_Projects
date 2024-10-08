package model;

import util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private int id;
    private String name;
    private String course;
    private int yearStarted;

    private static int counter = 0;
    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        id = 1000 + (++counter);
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
    }

    @Override
    public String toString() {
        return "%-10d %-15s %-15s %d".formatted(id, name, course, yearStarted);
    }

    public String getCourse() {
        return course;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
    }
}


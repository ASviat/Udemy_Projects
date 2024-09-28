package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018),
                new Employee(18105, "Lim", 1995),
                new Employee(16100, "Tim", 1985),
                new Employee(16056, "Jim", 1991)
        ));

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for (var employee : employees) {
            System.out.println(employee);
        }
    }
}

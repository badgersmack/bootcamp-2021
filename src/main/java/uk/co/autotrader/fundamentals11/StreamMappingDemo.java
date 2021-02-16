package uk.co.autotrader.fundamentals11;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squaredValues = numbers.stream()
                .map(integer -> integer * 2)
                .collect(Collectors.toList());

        System.out.println("squaredValues = " + squaredValues);

        // file.csv:
        List<String> staffList = List.of(
                "1,John,Doe,12000000",
                "2,Jill,Smith,15000000"
        );

        List<Employee> employees = staffList
                .stream()
                .map(staffValue -> {
                    String[] staffElements = staffValue.split(",");

                    Integer salary = Integer.parseInt(staffElements[3]);

                    return new Employee(staffElements[0], staffElements[1],
                            staffElements[2], salary);
                })
                .collect(Collectors.toList());

        System.out.println("filteredEmployees = " + employees);

        List<Employee> upperCasedEmployees = employees.stream()
                .map(employee -> upperCaseName(employee))
                .collect(Collectors.toList());

        System.out.println("upperCasedEmployees = " + upperCasedEmployees);


        // sorting:
        List<Employee> sortedEmployees = upperCasedEmployees.stream()
                .sorted((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()))
                .collect(Collectors.toList());

        System.out.println("sortedEmployees = " + sortedEmployees);

    }

    private static Employee upperCaseName(final Employee employee) {
        String firstNameUpper = employee.getFirstName().toUpperCase();
        String surnameUpper = employee.getLastName().toUpperCase();

        employee.setFirstName(firstNameUpper);
        employee.setLastName(surnameUpper);

        return employee;
    }
}

package movie220;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class ProcessingEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Mathew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing"),
        };
        List<Employee> list = Arrays.asList(employees);
        System.out.println("Complete Employee list");
        list.stream().forEach(System.out::println);
        Predicate<Employee> fourToSixThousands = e -> (e.getSalary() > 4000 && e.getSalary() < 6000);
        Predicate<Employee> variable = new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return (employee.getSalary() > 4000 && employee.getSalary() < 6000);
            }
        };
        System.out.printf("%nEmployees salary between $4000-$6000%n");

        list.stream().filter(variable).sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        System.out.printf("%nFirst Employee with salary between $4000-$6000%n%s%n",
                list.stream().filter(fourToSixThousands).findFirst().get());

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;
        Function<Employee, String> variable1 = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getFirstName();
            }
        };
        Function<Employee, String> variable2 = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getLastName();
            }
        };

        Comparator<Employee> lastThenFirst =
                Comparator.comparing(variable2).thenComparing(variable1);
        System.out.printf("%nEmployees in ascending order by last name and the first name%n");
        list.stream().sorted(lastThenFirst).forEach(System.out::println);
        System.out.printf("%nEmployees in descending order by last name and the first name%n");
        list.stream().sorted(lastThenFirst.reversed()).forEach(System.out::println);

        System.out.printf("%nUnique employees last names:%n");
        list.stream().map(Employee::getLastName).distinct().sorted().forEach(System.out::println);

        System.out.printf("%nEmployee name in order by last name then first name%n");
        list.stream().sorted(lastThenFirst).map(Employee::getName).forEach(System.out::println);

        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        //System.out.printf("%n%nThe groupedByDepartment variable is : %s%n%n",groupedByDepartment);
        groupedByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.println(department);
            employeesInDepartment.forEach(employee -> System.out.printf("   %s%n", employee));
        });
        System.out.println();
        System.out.printf("%nCount of employees by department:%n");
        Map<String, Long> empCountByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));
        empCountByDepartment.forEach
                ((department, count) -> System.out.printf("%s has %d employee%n", department, count));


        System.out.printf("%nSum of employees salaries (via sum method): %.2f%n",
                list.stream().mapToDouble(Employee::getSalary).sum());
        System.out.printf("%nSum of employees salaries (via sum method): %.2f%n",
                list.stream().mapToDouble(new ToDoubleFunction<Employee>() {
                    @Override
                    public double applyAsDouble(Employee value) {
                        return value.getSalary();
                    }
                }).sum());


        System.out.printf("%nSum of employee salaries (via reduce method): %.2f%n",
                list.stream().mapToDouble(Employee::getSalary).reduce(0, (value1, value2) -> value1 + value2));

        System.out.printf("%nAverage of Employee's salaris: %.2f%n",
                list.stream().mapToDouble(Employee::getSalary).average().getAsDouble());


    }
}

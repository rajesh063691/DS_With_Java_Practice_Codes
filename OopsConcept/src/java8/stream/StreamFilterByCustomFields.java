package java8.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Employee class
class Employee {

    // attributes of an Employee
    String name;
    int age;

    // constructor
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString to print
    // provided content when an Object
    // is printed
    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
}

public class StreamFilterByCustomFields {
    public static void filterByAge() {
        // create list of Employees
        List<Employee> myList = Arrays.asList(new Employee("Rajesh", 25), new Employee("Kumar", 40), new Employee("Rakesh", 35));

        // create a stream on the list
        // filter by age of an employee
        Stream<Employee> empStream = myList.stream();
        // empStream.filter(e->e.age>)
        empStream.filter(e -> e.age >= 30).forEach(
                System.out::println
        );


        System.out.println(Runtime.getRuntime().availableProcessors());
    }


    public static void main(String[] args) {
        filterByAge();
    }
}

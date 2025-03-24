package java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Person {
    Integer id;
    String name;
    Integer age;

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Person() {

    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(1, "Rajesh", 32));
        persons.add(new Person(2, "Rohit", 33));
        persons.add(new Person(3, "Mohit", 34));

        persons.stream().map(i -> i.age).forEach(System.out::println);
        System.out.println("<=========>");
        persons.stream().filter(i -> i.age >= 33).map(i -> i.age).forEach(System.out::println);

        // return map of age and Person Object
        Map<Integer, Person> mp = new HashMap<Integer, Person>();

        mp = persons.stream().collect(Collectors.toMap(Person::getAge, person -> person));
        System.out.println(mp);


        Integer[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length - 1; j++) {
//                if (arr[i] > arr[j]) {
////                    int temp = arr[i];
////                    arr[i] = arr[j];
////                    arr[j] = temp;
//                    arr[i] = arr[i] + arr[j];
//                    arr[j] = arr[i] - arr[j];
//                    arr[i] = arr[i] - arr[j];
//                }
//            }
//        }
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (arr[start] > arr[end]) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            start++;
            end--;
        }


//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] != arr[n - 1] && arr[n - 1] != 1) {
//                int temp = arr[i];
//                arr[i] = arr[n - 1];
//                arr[n - 1] = temp;
//                n = n - 1;
//            }
//
//
//        }
        System.out.println(Arrays.toString(arr));
    }
}

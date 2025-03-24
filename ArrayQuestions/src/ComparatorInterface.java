import java.util.*;
import java.util.Comparator;

// Class 1
// A class to represent a Student
class Student {

    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {

        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method of Student class
    // To print student details in main()
    public String toString() {

        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
                + this.address;
    }
}

class SortByRollNo implements Comparator<Student> {
    // display the result in ascending order
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollno - s2.rollno;
    }
}

class SortByName implements Comparator<Student> {
    // display the result in ascending order by name
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}


public class ComparatorInterface {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        System.out.println("Unsorted");
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        // Sorting student entries by roll number
        Collections.sort(ar, new SortByRollNo());

        // Display message on console for better readability
        System.out.println("\nSorted by rollno");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        // Sorting student entries by roll number
        Collections.sort(ar, new SortByName());

        // Display message on console for better readability
        System.out.println("\nSorted by Name");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

    }
}

package interview.questions;


final class Emp {
    final int age;
    final String name;
    final Departments dept;

    public Emp(int age, String name, Departments dept) {
        this.age = age;
        this.name = name;

        // do deep copy
        Departments newDept = new Departments();
        newDept.id = dept.getId();
        newDept.name = dept.getName();

        this.dept = newDept;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Departments getDept() {
        Departments newDept = new Departments();
        newDept.id = dept.getId();
        newDept.name = dept.getName();

        return newDept;
    }

    @Override
    public String toString() {
        return dept.getId() + " :: " + dept.getName();
    }
}

public class FinalClassWithReference {
    public static void main(String[] args) {
        Departments departments = new Departments("Rajesh Kumar", 1);
        Emp emp = new Emp(33, "Raj", departments);
        System.out.println(emp.getAge());
        System.out.println(emp.getName());
        System.out.println(emp.getDept().getId());
        System.out.println(emp.getDept().getName());

        departments.setId(2);
        departments.setName("Manish");

        System.out.println(emp.getDept().getId());
        System.out.println(emp.getDept().getName());
    }


}

package com.rajesh.randomCodes;

import java.util.List;

public class User {
    private String name;
    private String number;
    private List<String> email;
    private int salary;

    private String  dept;

    public User(String name, String number, List<String> email, int salary, String dept) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.salary = salary;
        this.dept = dept;
    }

    public User(String name, String number, List<String> email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public List<String> getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }
}

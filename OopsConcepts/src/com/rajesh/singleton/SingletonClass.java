package com.rajesh.singleton;

// class that can create only one object - so you should not allow to call the constructor
public class SingletonClass {

    private int num = 0;

    private SingletonClass() {
        this.num = 25;
    }

    public static SingletonClass instance;

    public static SingletonClass getInstance() {
        // means object is not created, then create one
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

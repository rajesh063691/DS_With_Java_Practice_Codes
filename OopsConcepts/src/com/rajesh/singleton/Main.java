package com.rajesh.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonClass ins1 = SingletonClass.getInstance();
        SingletonClass ins2 = SingletonClass.getInstance();
        SingletonClass ins3 = SingletonClass.getInstance();
    }
}

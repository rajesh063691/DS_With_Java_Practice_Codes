package com.rajesh.synchronization;


import java.util.ArrayList;
import java.util.List;

class Geek {
    String name = "";
    public int count = 0;

    public void geekName(String geek, List<String> list) {
        // Only one thread is permitted
        // to change geek's name at a time.
        synchronized (this) {
            name = geek;
            count++;  // how many threads change geek's name.
        }

        // All other threads are permitted
        // to add geek name into list.
        list.add(geek);
    }
}

class ThreadA extends Thread {
    Geek geek;
    List<String> list;
    String geekName;


    ThreadA(Geek geek, List<String> list, String geekName) {
        this.geek = geek;
        this.list = list;
        this.geekName = geekName;
    }

    @Override
    public void run() {
        geek.geekName(geekName, list);
    }
}

class ThreadB extends Thread {
    Geek geek;
    List<String> list;
    String geekName;


    ThreadB(Geek geek, List<String> list, String geekName) {
        this.geek = geek;
        this.list = list;
        this.geekName = geekName;
    }

    @Override
    public void run() {
        geek.geekName(geekName, list);
    }
}

class ThreadC extends Thread {
    Geek geek;
    List<String> list;
    String geekName;


    ThreadC(Geek geek, List<String> list, String geekName) {
        this.geek = geek;
        this.list = list;
        this.geekName = geekName;
    }

    @Override
    public void run() {
        geek.geekName(geekName, list);
    }
}

public class SyncBlock {
    public static void main(String[] args) {
        Geek geek = new Geek();
        List<String> list = new ArrayList<>();
        ThreadA t1 = new ThreadA(geek, list, "Rajesh");
        ThreadB t2 = new ThreadB(geek, list, "Puja");
        ThreadC t3 = new ThreadC(geek, list, "Musaria");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("total names added :: " + geek.count);
        System.out.println("Name List :: " + list);
    }

}

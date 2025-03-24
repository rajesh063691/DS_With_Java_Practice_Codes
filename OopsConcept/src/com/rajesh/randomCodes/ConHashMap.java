package com.rajesh.randomCodes;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMap extends Thread {

    private static Map<String, Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            map.put("D", 104);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception thrown...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put("A", 101);
        map.put("B", 102);
        map.put("C", 103);
        map.put(null, null);

        ConHashMap t1 = new ConHashMap();
        t1.start();

        for (Object obj : map.entrySet()) {
            Object s=obj;
            System.out.println(s);
            Thread.sleep(1000);
        }

        System.out.println(map);

    }

}

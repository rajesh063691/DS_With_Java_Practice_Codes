package com.rajesh.multithreading;

//class PrintMessage {
//    String msg;
//
//    PrintMessage(String msg) {
//        this.msg = msg;
//    }
//
//
//
//}

class Ping extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ping");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Pong extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Pong");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

public class PrintPingPong {
    public static void main(String[] args) {

        Thread ping = new Thread(new Ping());
        Thread pong = new Thread(new Pong());

        ping.start();
        pong.start();

        try {
            ping.join();
            pong.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

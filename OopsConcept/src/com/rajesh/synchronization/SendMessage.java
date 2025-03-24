package com.rajesh.synchronization;


class Sender {
    public void send(String msg) {
        System.out.println("Sending  " + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(msg + " Sent");
    }
}

class ThreadClass extends Thread {
    private String msg;
    Sender sender;

    ThreadClass(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    public void run() {
        // Only one thread can send a message at a time.
        synchronized (sender) {
            // synchronizing the send object
            sender.send(msg);
        }
    }
}


public class SendMessage {
    public static void main(String[] args) {
        Sender sender = new Sender();
        ThreadClass t1 = new ThreadClass("Hi", sender);
        ThreadClass t2 = new ThreadClass("Bye", sender);

        // Start two threads of ThreadedSend type
        t1.start();
        t2.start();

        // wait for both the threads to end
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
